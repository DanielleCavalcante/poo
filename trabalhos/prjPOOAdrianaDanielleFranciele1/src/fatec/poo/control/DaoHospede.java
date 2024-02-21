package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Hospede;

/**
 *
 * @author Adriana, Danielle e Franciele.
 */
public class DaoHospede {
    private Connection conn; //conexao
    
    public DaoHospede(Connection conn) {
         this.conn = conn;
    }
    
    //ações no banco de dados da classe hospede:
    public void inserir(Hospede hospede) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbHOSPEDE(CPF_HOSP, NOME_HOSP, ENDERECO_HOSP, TELEFONE_HOSP,TAXA_DESCONTO) VALUES(?,?,?,?,?)");
            ps.setString(1, hospede.getCpf());
            ps.setString(2, hospede.getNome());
            ps.setString(3, hospede.getEndereco());
            ps.setString(4, hospede.getTelefone());
            ps.setDouble(5, hospede.getTaxaDesconto());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Hospede hospede) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbHOSPEDE set NOME_HOSP = ?, ENDERECO_HOSP = ?, TELEFONE_HOSP = ?, TAXA_DESCONTO = ?" + "where CPF_HOSP = ?");
            
            ps.setString(1, hospede.getNome());
            ps.setString(2, hospede.getEndereco());
            ps.setString(3, hospede.getTelefone());
            ps.setDouble(4, hospede.getTaxaDesconto());
            ps.setString(5, hospede.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public  Hospede consultar (String cpf) {
        Hospede h = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbHOSPEDE where " +
                                                 "CPF_HOSP = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                h = new Hospede(cpf, rs.getString("NOME_HOSP")); //construtor
                h.setEndereco(rs.getString("ENDERECO_HOSP")); //outros valores
                h.setTelefone(rs.getString("TELEFONE_HOSP"));
                h.setTaxaDesconto(rs.getDouble("TAXA_DESCONTO"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (h);
    }   
    
    public void excluir(Hospede hospede) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbHOSPEDE where CPF_HOSP = ?");
            
            ps.setString(1, hospede.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
