package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Registro;
import java.time.LocalDate;

/**
 *
 * @author Adriana, Danielle e Franciele.
 */
public class DaoRegistro {
    private Connection conn; //conexao
    
    public DaoRegistro(Connection conn) {
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
    
    public  Registro consultar (int codigo) {
        Registro reg= null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbREGISTRO where " +
                                                 "CODIGO = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                reg = new Registro(codigo, rs.getDate("DATA_ENTRADA").toLocalDate(), rs.getString("REG_FUNC_RECEPCIONISTA")); //
                reg.setEndereco(rs.getString("ENDERECO_HOSP")); //outros valores
                reg.setTelefone(rs.getString("TELEFONE_HOSP"));
                reg.setTaxaDesconto(rs.getDouble("TAXA_DESCONTO"));
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
