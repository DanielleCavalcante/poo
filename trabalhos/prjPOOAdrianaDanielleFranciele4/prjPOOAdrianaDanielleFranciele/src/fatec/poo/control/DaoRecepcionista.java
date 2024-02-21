package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Recepcionista;

/**
 *
 * @author Adriana, Danielle e Franciele.
 */
public class DaoRecepcionista {
    private Connection conn;
    
    public DaoRecepcionista(Connection conn) {
         this.conn = conn;
    }
    
    //ações no banco de dados da classe hospede:
    public void inserir(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbRECEPCIONISTA(REGFUNC_RECEP, NOME_RECEP, ENDERECO_RECEP, "
                    + "TELEFONE_RECEP, TURNO_RECEP) VALUES(?,?,?,?,?)");
            ps.setInt(1, recepcionista.getRegFunc());
            ps.setString(2, recepcionista.getNome());
            ps.setString(3, recepcionista.getEndereco());
            ps.setString(4, recepcionista.getTelefone());
            ps.setString(5, recepcionista.getTurno());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbRECEPCIONISTA set NOME_RECEP = ?, ENDERECO_RECEP = ?, TELEFONE_RECEP = ?, TURNO_RECEP = ? " + "where REGFUNC_RECEP = ?");
            
            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getEndereco());
            ps.setString(3, recepcionista.getTelefone());
            ps.setString(4, recepcionista.getTurno());
            ps.setInt(5, recepcionista.getRegFunc());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public  Recepcionista consultar (int regFunc) {
        Recepcionista r = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbRECEPCIONISTA where REGFUNC_RECEP = ?");
            
            ps.setInt(1, regFunc);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                r = new Recepcionista (regFunc, rs.getString("NOME_RECEP")); //construtor
                r.setEndereco(rs.getString("ENDERECO_RECEP"));
                r.setTelefone(rs.getString("TELEFONE_RECEP"));
                r.setTurno(rs.getString("TURNO_RECEP"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (r);
    }   
    
    public void excluir(Recepcionista recepcionista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbRECEPCIONISTA where REGFUNC_RECEP = ?");
            
            ps.setInt(1, recepcionista.getRegFunc());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
