
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        
        Instrutor objInstrutor = new Instrutor (1010, "Carlos Silveira", "15 99657-3113");
        Cliente objCliente = new Cliente ("000.000.000-00", "Fernando Ribeiro", "15 98117-7007");
        
        objCliente.setAltura(1.80);
        objCliente.setPeso(65.00);
        objCliente.setEmail("carlos@fatec.sp.gov.br");
        System.out.println("Nome cliente: " + objCliente.getNome());
        System.out.println("CPF cliente: " + objCliente.getCPF());
        System.out.println("Telefone cliente: " + objCliente.getTelefone());
        System.out.println("E-mail cliente: " + objCliente.getEmail());
        System.out.println("Peso cliente: " + df.format(objCliente.getPeso()));
        System.out.println("Altura cliente: " + df.format(objCliente.getAltura()));
        System.out.println("IMC cliente: " + df.format(objCliente.calcIMC()));
        
        objInstrutor.setAreaAtuacao("Saúde");
        objInstrutor.setEmail("instrutor@fatec.sp.gov.br");
        System.out.println("\nNome instrutor: " + objInstrutor.getNome());
        System.out.println("Identificação instrutor: " + objInstrutor.getIdentificacao());
        System.out.println("Telefone instrutor: " + objInstrutor.getTelefone());
        System.out.println("E-mail instrutor: " + objInstrutor.getEmail());
        System.out.println("Area de atuação instrutor: " + objInstrutor.getAreaAtuacao());
    }
}