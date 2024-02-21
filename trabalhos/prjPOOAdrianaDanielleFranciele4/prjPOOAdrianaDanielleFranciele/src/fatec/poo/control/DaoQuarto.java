package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Quarto;
/**
 *
 * @author Adriana, Danielle e Franciele
 */
public class DaoQuarto {
     private Connection conn;
    
    public DaoQuarto(Connection conn) {
         this.conn = conn;
    }
    
    //ações no banco de dados da classe hospede:
    public void inserir(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbQUARTO (NUM_QUARTO, TIPO_QUARTO, VALORDIARIA_QUARTO) VALUES(?,?,?)");
            ps.setInt(1, quarto.getNumero());
            ps.setString(2, quarto.getTipo());
            ps.setDouble(3, quarto.getValorDiaria());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
     public void alterar(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbQUARTO set TIPO_QUARTO = ?, VALORDIARIA_QUARTO = ? , TOTAL_FATURADO = ?, STATUS = ? "+
                                                 "where NUM_QUARTO = ?"); //
            
            ps.setString(1, quarto.getTipo());
            ps.setDouble(2, quarto.getValorDiaria());
            ps.setDouble(3, quarto.getTotalFaturado());
            if(quarto.getSituacao() == true){
                ps.setInt(4, 1);//MUDA O VALOR DA SITUAÇÃO DO QUARTO PARA RESERVADO (1 - TRUE)
            }else{
                ps.setInt(4, 0);//MUDA O VALOR DA SITUAÇÃO DO QUARTO PARA LIBERADO (0 - FALSE)
            }
            ps.setInt(5, quarto.getNumero());
            
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
     
     public  Quarto consultar (int numero) {
        Quarto q = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbQUARTO where " +
                                                 "NUM_QUARTO = ?");
            
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                q = new Quarto (numero, rs.getString ("TIPO_QUARTO"), rs.getDouble("VALORDIARIA_QUARTO")); //construtor
                q.setSituacao(rs.getBoolean("STATUS"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (q);
    }   
     
     public void excluir(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbQUARTO where NUM_QUARTO = ?");
            
            ps.setInt(1, quarto.getNumero());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    } 
}
