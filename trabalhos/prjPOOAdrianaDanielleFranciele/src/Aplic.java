
import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import fatec.poo.model.ServicoQuarto;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Adriana, Danielle e Franciele
 */
public class Aplic {

    public static void main(String[] args) {
    
    //Instanciando um objeto Hospede
    Hospede objHospede = new Hospede("000.111.222-33", "Franciele");
                                        //CPF             //NOME
                                        
    objHospede.setEndereco("Rua 1, 111");
    objHospede.setTelefone("(15) 1111-2222");
    objHospede.setTaxaDesconto(0);
    
    System.out.println("\nInformações do Hospede:");
    System.out.println("Nome do Hospede: " + objHospede.getNome());
    System.out.println("CPF do Hospede: " + objHospede.getCpf());
    System.out.println("Endereço do Hospede: " + objHospede.getEndereco());
    System.out.println("Telefone do Hospede: " + objHospede.getTelefone());
    System.out.println("Taxa de Desconto do Hospede: " + objHospede.getTaxaDesconto());
    
    //Instanciando um objeto Recepcionista
    Recepcionista objRecepcionista = new Recepcionista(111,"Joao");
                                           // Regist Func  //Nome
    objRecepcionista.setEndereco("Rua 2, 222");
    objRecepcionista.setTelefone("(15) 3333-4444");
    objRecepcionista.setTurno("M");
    
    System.out.println("\nInformações do Recepcionista:");
    System.out.println("Nome do Recepcionista: " + objRecepcionista.getNome());
    System.out.println("Endereço do Recepcionista: " + objRecepcionista.getEndereco());
    System.out.println("Telefone do Recepcionista: " + objRecepcionista.getTelefone());
    System.out.println("Registro do Recepcionista: " + objRecepcionista.getRegFunc());
    System.out.println("Turno do Recepcionista: " + objRecepcionista.getTurno());
    
    //Instanciando um objeto Quarto
    Quarto objQuarto = new Quarto(123, "S", 200.00);
                                 //N°  //Tipo //Valor da diária
    objQuarto.reservar();
    objQuarto.liberar(5);
    
    System.out.println("\nInformações do Quarto:");
    System.out.println("Numero do Quarto: " + objQuarto.getNumero());
    System.out.println("Tipo do Quarto: " + objQuarto.getTipo());
    System.out.println("Situação do Quarto: " + objQuarto.getSituacao());
    System.out.println("Valor da Diaria: " + objQuarto.getValorDiaria());
    System.out.println("Total Faturado: " + objQuarto.getTotalFaturado());
                         
    //Instanciando um objeto ServicoQuarto
    ServicoQuarto objServico1 = new ServicoQuarto(1, "Cafe da Manhã"); //serviço de café da manhã
                                                 //Codigo  //Descrição
    objServico1.setValor(50.00);
    
    ServicoQuarto objServico2 = new ServicoQuarto(2, "Almoço"); //serviço de almoço
    objServico2.setValor(60.00);
    
    ServicoQuarto objServico3 = new ServicoQuarto(3, "Estacionamento"); //serviço de estacionamento
    objServico3.setValor(20.00);
    
    ServicoQuarto objServico4 = new ServicoQuarto(4, "Academia"); //serviço de academia
    objServico4.setValor(10.00);
    
    ServicoQuarto objServico5 = new ServicoQuarto(5, "Aluguel de Carro"); //serviço de aluguel de carro
    objServico5.setValor(30.00);
    
    System.out.println("\nInformações dos Serviços:");
    System.out.println("\nCodigo do 1° Serviço: " + objServico1.getCodigo());
    System.out.println("\nDescrição do 1° Serviço: " + objServico1.getDescricao());
    System.out.println("\nValor do 1° Serviço: " + objServico1.getValor());
    
    System.out.println("\nCodigo do 2° Serviço: " + objServico2.getCodigo());
    System.out.println("\nDescrição do 2° Serviço: " + objServico2.getDescricao());
    System.out.println("\nValor do 2° Serviço: " + objServico2.getValor());
    
    System.out.println("\nCodigo do 3° Serviço: " + objServico3.getCodigo());
    System.out.println("\nDescrição do 3° Serviço: " + objServico3.getDescricao());
    System.out.println("\nValor do 3° Serviço: " + objServico3.getValor());
    
    System.out.println("\nCodigo do 4° Serviço: " + objServico4.getCodigo());
    System.out.println("\nDescrição do 4° Serviço: " + objServico4.getDescricao());
    System.out.println("\nValor do 4° Serviço: " + objServico4.getValor());
    
    System.out.println("\nCodigo do 5° Serviço: " + objServico5.getCodigo());
    System.out.println("\nDescrição do 5° Serviço: " + objServico5.getDescricao());
    System.out.println("\nValor do 5° Serviço: " + objServico5.getValor());
    
    //Instanciando um objeto Registro
    Registro objRegistro = new Registro(001, LocalDate.of(2023, 1, 1), objRecepcionista);
                                   // Codigo //Entrada  //Recepcionista
    
    System.out.println("\nInformações do Registro: ");
    
    //Reservar Quarto:
    objRegistro.reservarQuarto(objHospede, objQuarto);
    System.out.println("Situacão: " + objQuarto.getSituacao());//Codigo inserido apenas para testar se o metodo reservar quarto funcionou -> estado deve ser true=ocupado
    
    //Saida do Hospede:
    objRegistro.setDataSaida(LocalDate.of(2023, 1, 5));
    objRegistro.liberarQuarto();
    System.out.println("Situacão: " + objQuarto.getSituacao());//Codigo inserido apenas para testar se o metodo liberarQuarto funcionou -> estado deve ser false=disponivel
    
    System.out.println("Codigo do Registro: " + objRegistro.getCodigo());
    System.out.println("Data de Entrada: " + objRegistro.getDataEntrada());
    System.out.println("Data de Saída: " + objRegistro.getDataSaida());
    System.out.println("Valor da Hospedagem: " + objRegistro.getValorHospedagem());
    }
}
