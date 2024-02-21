package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.ServicoQuarto;

/**
 *
 * @author Adriana, Danielle e Franciele.
 */
public class DaoServicoQuarto {
    private Connection conn;
    
    public DaoServicoQuarto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbSERVICOQUARTO(CODIGO_SERVICO, DESCRICAO_SERVICO, VALOR_SERVICO) VALUES(?,?,?)");
            ps.setInt(1, servicoQuarto.getCodigo());
            ps.setString(2, servicoQuarto.getDescricao());
            ps.setDouble(3, servicoQuarto.getValor());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(ServicoQuarto servicoQuarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbSERVICOQUARTO set DESCRICAO_SERVICO = ?, VALOR_SERVICO = ?"
                                                        + "where CODIGO_SERVICO = ?");
            
            ps.setString(1, servicoQuarto.getDescricao());
            ps.setDouble(2, servicoQuarto.getValor());
            ps.setInt(3, servicoQuarto.getCodigo());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public ServicoQuarto  consultar (int codigo_servico) {
        ServicoQuarto s = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbSERVICOQUARTO where " +
                                                 "CODIGO_SERVICO = ?");
            
            ps.setInt(1, codigo_servico);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                s = new ServicoQuarto(codigo_servico, rs.getString("DESCRICAO_SERVICO")); //construtor
                s.setValor(rs.getDouble("VALOR_SERVICO")); //outros valores
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (s);
    }   
    
    public void excluir(ServicoQuarto servico) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbSERVICOQUARTO where CODIGO_SERVICO = ?");
            
            ps.setInt(1, servico.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
