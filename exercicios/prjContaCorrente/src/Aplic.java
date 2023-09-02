
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        double valor;
        
        ContaCorrente objContaCorrente = new ContaCorrente (12345, 0); //inicializando já com o numero da conta e o saldo disponível (não pedimos para o usuario digitar)
        
        do{
            System.out.println("\n\n1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar saldo");
            System.out.println("4-Sair");
            System.out.print("\n\tDigite a opção: ");            
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\nNúmero da conta:  " + objContaCorrente.getNumero());
                System.out.print("Digite o valor do depósito: ");  
                valor = entrada.nextDouble();
                objContaCorrente.depositar(valor);
            }else
               if (opcao == 2){
                   System.out.println("\nNúmero da conta:  " + objContaCorrente.getNumero());
                   System.out.print("Digite o valor de saque: "); 
                   valor = entrada.nextDouble();
                   
                   if(objContaCorrente.getSaldo() >= valor){
                       objContaCorrente.sacar(valor);
                   }else
                       System.out.println("\n---- Saldo Insuficiente! ----");
               }else
                   if (opcao == 3){
                      System.out.println("\nNúmero da conta:  " + objContaCorrente.getNumero());
                      System.out.println("Saldo atual:  " + objContaCorrente.getSaldo());
               }
        }while(opcao < 4);
    }
}
