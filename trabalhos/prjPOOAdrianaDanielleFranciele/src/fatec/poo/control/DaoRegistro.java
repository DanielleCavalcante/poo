package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Registro;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;


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
    
    public  Registro consultar (int codigo) {
        Registro reg= null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT r.REG_FUNC_RECEPCIONISTA, r.CPF_HOSPEDE, r.NUMERO_QUARTO, r.DATA_ENTRADA, r.DATA_SAIDA, r.VALOR_HOSP " +
                                   "FROM tbREGISTRO r " + "WHERE r.CODIGO = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                //instanciando recepcionista para poder acessar os atributos
                Recepcionista recepcionista = new Recepcionista(rs.getInt("NUMERO_IDENTIFICACAO"), rs.getString("REG_FUNC_RECEPCIONISTA"));                
                
                Hospede hospede = new Hospede(rs.getString("CPF_HOSP"), rs.getString("NOME_HOSP")); //construtor - nome não é utilizado aqui
                reg.setHospede(hospede);
                
                Quarto quarto = new Quarto(rs.getInt("NUM_QUARTO"), rs.getString("TIPO_QUARTO"), rs.getDouble("VALORDIARIA_QUARTO")); //só utilizamos numQuarto
                reg.setQuarto(quarto);
                
                reg = new Registro(codigo, rs.getDate("DATA_ENTRADA").toLocalDate(), recepcionista); // construtor
                reg.setDataSaida(rs.getDate("DATA_SAIDA").toLocalDate());
                reg.setValorHospedagem(rs.getDouble("VALOR_HOSP"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (reg);
    }   
    
    public void reservar(Registro registro) {
        PreparedStatement ps = null;
        
        try {
            int situacao = 1;
            
            ps = conn.prepareStatement("UPDATE tbREGISTRO set DATA_ENTRADA = ?, VALOR_HOSP = ?, CPF_HOSPEDE = ?, REG_FUNC_RECEPCIONISTA = ?,"+
                                        " NUMERO_QUARTO = ?, SITUACAO_QUARTO = ?" + "where CODIGO = ?"); //INSERE O CÓDIGO DO REGISTRO
            
            ps.setDate(1, Date.valueOf(registro.getDataEntrada()));
            ps.setDouble(2, registro.getQuarto().getValorDiaria());
            ps.setString(3, registro.getHospede().getCpf());
            ps.setInt(4, registro.getRecepcionista().getRegFunc());
            ps.setInt(5, registro.getQuarto().getNumero());
            ps.setInt(6, situacao);
            ps.setInt(7, registro.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void liberar(Registro registro) {
        PreparedStatement ps = null;
        try {           
            int situacao = 0; //quarto 0 é livre e 1 é ocupado
            
            ps = conn.prepareStatement("UPDATE tbREGISTRO SET SITUACAO_QUARTO = ? WHERE CODIGO = ?"); //MUDA O VALOR DE SITUAÇÃO DO QUARTO
                        
            ps.setInt(1, situacao);
            ps.setInt(2, registro.getCodigo());
         
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
   
}
