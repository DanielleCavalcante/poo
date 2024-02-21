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


/**
 *
 * @author Adriana, Danielle e Franciele.
 */
public class DaoRegistro {
    private Connection conn; //conexao
    
    public DaoRegistro(Connection conn) {
         this.conn = conn;
    }
    
    //ações no banco de dados

    public  Registro consultar (int codigo){
        Registro reg = null; //reg é um ponteiro de Registro
      
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM tbREGISTRO where CODIGO = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true){
                //ACESSO A TABELA RECEPCIONISTA
                PreparedStatement consultaTabelaRecepcionista = null; //Criado novo obj PreparedStatement para consultar tabela Recepcionista
                consultaTabelaRecepcionista = conn.prepareStatement("SELECT * FROM tbRECEPCIONISTA where REGFUNC_RECEP = ?");
                consultaTabelaRecepcionista.setInt(1,rs.getInt("REG_FUNC_RECEPCIONISTA"));
                ResultSet tabelaRecep = consultaTabelaRecepcionista.executeQuery();
                
                if (tabelaRecep.next() == true){
                    Recepcionista recepcionista = new Recepcionista(rs.getInt("REG_FUNC_RECEPCIONISTA"),tabelaRecep.getString("NOME_RECEP"));
                
                    //ACESSO A TABELA HOSPEDE
                    PreparedStatement consultaTabelaHospede = null; //Criado novo obj PreparedStatement para consultar tabela Hospede
                    consultaTabelaHospede = conn.prepareStatement("SELECT * FROM tbHOSPEDE where CPF_HOSP = ?");
                    consultaTabelaHospede.setString(1,rs.getString("CPF_HOSPEDE"));
                    ResultSet tabelaHosp = consultaTabelaHospede.executeQuery();
                    
                    if (tabelaHosp.next() == true){
                        Hospede hospede = new Hospede(rs.getString("CPF_HOSPEDE"), tabelaHosp.getString("NOME_HOSP")); //construtor - nome não é utilizado aqui

                        //ACESSO A TABELA QUARTO
                        PreparedStatement consultaTabelaQuarto = null; //Criado novo obj PreparedStatement para consultar tabela Quarto
                        consultaTabelaQuarto = conn.prepareStatement("SELECT * FROM tbQUARTO where NUM_QUARTO = ?");
                        consultaTabelaQuarto.setInt(1,rs.getInt("NUMERO_QUARTO"));
                        ResultSet tabelaQuarto = consultaTabelaQuarto.executeQuery();

                        if (tabelaQuarto.next() == true){
                            Quarto quarto = new Quarto(rs.getInt("NUMERO_QUARTO"), tabelaQuarto.getString("TIPO_QUARTO"), tabelaQuarto.getDouble("VALORDIARIA_QUARTO")); //só utilizamos numQuarto
                        
                            reg = new Registro(codigo, rs.getDate("DATA_ENTRADA").toLocalDate(), recepcionista); // construtor
                            reg.setHospede(hospede);
                            reg.setQuarto(quarto);
                        }
                        
                        if (rs.getDate("DATA_SAIDA") != null) {
                            reg.setDataSaida(rs.getDate("DATA_SAIDA").toLocalDate());
                            reg.setValorHospedagem(rs.getDouble("VALOR_HOSP"));
                        }          
                    }
                }
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
            ps = conn.prepareStatement("INSERT INTO tbREGISTRO(CODIGO,REG_FUNC_RECEPCIONISTA,CPF_HOSPEDE,NUMERO_QUARTO,DATA_ENTRADA)VALUES(?,?,?,?,?)");
            ps.setInt(1, registro.getCodigo());
            ps.setInt(2, registro.getRecepcionista().getRegFunc());
            ps.setString(3, registro.getHospede().getCpf());
            ps.setInt(4, registro.getQuarto().getNumero());
            ps.setDate(5, Date.valueOf(registro.getDataEntrada()));
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void liberar(Registro registro) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbREGISTRO SET DATA_SAIDA = ?, VALOR_HOSP = ? WHERE CODIGO = ?");
            ps.setDate(1, Date.valueOf(registro.getDataSaida()));
            ps.setDouble(2, registro.liberarQuarto());
            ps.setInt(3, registro.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
   
}
