
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        int opcao, num;
        double valor, valSaldo;
        
        System.out.print("Digite o número da conta "); 
        num = entrada.nextInt(); 
        System.out.print("Digite o saldo atual: ");
        valSaldo = entrada.nextDouble(); 
        
        ContaCorrente objContaCorrente = new ContaCorrente (num, valSaldo); //ou (num, 0) --- iniciar saldo com 0
        
        do{
            System.out.println("\n\n1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar saldo");
            System.out.println("4-Sair");
            System.out.print("\n\tDigite a opção: ");            
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\nNúmero da conta:  " + objContaCorrente.getNumero());
                    System.out.print("Digite o valor do depósito: ");
                    valor = entrada.nextDouble();
                    objContaCorrente.depositar(valor);
                    break;
                case 2:
                    System.out.println("\nNúmero da conta:  " + objContaCorrente.getNumero());
                    System.out.print("Digite o valor de saque: ");
                    valor = entrada.nextDouble();
                    if(objContaCorrente.getSaldo() >= valor){
                        objContaCorrente.sacar(valor);
                    }else
                        System.out.println("\n---- Saldo Insuficiente! ----");
                    break;
                case 3:
                    System.out.println("\nNúmero da conta:  " + objContaCorrente.getNumero());
                    System.out.println("Saldo atual:  " + df.format(objContaCorrente.getSaldo()));
                    break;
                default:
                    break;
            }
        }while(opcao < 4);
    }
}
