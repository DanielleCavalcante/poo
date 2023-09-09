
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author danielle
 */
public class Aplic {

    public static void main(String[] args) {
        //DECLARAÇÃO DE VARIAVEIS E INSTANCIAÇÃO DE OBJETOS
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        int opcao, numConta;
        Double valor;

        //definição da matriz
        ContaCorrente[] objContaCorrente = new ContaCorrente[3];

        //ENTRADA DE DADOS
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--------------------------------");
            System.out.print("Digite o número da conta: ");
            numConta = entrada.nextInt();
            System.out.print("Digite o saldo atual: ");
            valor = entrada.nextDouble();
            System.out.println("--------------------------------");

            //instanciando e passando parametros
            objContaCorrente[i] = new ContaCorrente(numConta, valor);
        }

        //MENU DE OPÇÕES (execução)
        do {
            System.out.println("\n1-Sacar");
            System.out.println("2-Depositar");
            System.out.println("3-Consultar saldo");
            System.out.println("4-Listar Contas");
            System.out.println("5-Sair");
            System.out.print("\n\tDigite a opção: ");
            opcao = entrada.nextInt();

            //para poder sair do loop
            boolean encontrei = false;

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o número da conta que deseja executar: ");
                    numConta = entrada.nextInt();
                    
                    for (int i = 0; i < objContaCorrente.length ; i++) {
                        if (objContaCorrente[i].getNumero() == numConta) {
                            encontrei = true; //quando algum numConta de algum obj for igual ao numConta digitado, então fica true
                            System.out.println("\n\nNúmero da conta: " + objContaCorrente[i].getNumero());
                            System.out.print("Digite o valor que deseja sacar: ");
                            valor = entrada.nextDouble();
                            if (valor <= objContaCorrente[i].getSaldo()) {
                                objContaCorrente[i].sacar(valor);
                                System.out.println("\nSaque efetuado com sucesso!");
                            } else {
                                System.out.println("\nSaldo Insuficiente!");
                            }
                            break;
                        }
                    }
                    if (!encontrei) { //passou pelo for e não foi true
                        System.out.println("\nConta não cadastrada!");
                    }
                    break;
                case 2:
                    System.out.print("\nDigite o número da conta que deseja executar: ");
                    numConta = entrada.nextInt();
                    for (int i = 0; i < objContaCorrente.length ; i++) {
                        if (objContaCorrente[i].getNumero() == numConta) {
                            encontrei = true;
                            System.out.println("\n\nNúmero da conta: " + objContaCorrente[i].getNumero());
                            System.out.print("Digite o valor que deseja depositar: ");
                            valor = entrada.nextDouble();
                            objContaCorrente[i].depositar(valor);
                            System.out.println("\nDepósito efetuado com sucesso!");
                            break;
                        }
                    }
                    if (!encontrei) {
                        System.out.println("\nConta não cadastrada!");
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o número da conta que deseja executar: ");
                    numConta = entrada.nextInt();
                    for (int i = 0; i < objContaCorrente.length ; i++) {
                        if (objContaCorrente[i].getNumero() == numConta) {
                            encontrei = true;
                            System.out.println("\n\nNúmero da conta: " + objContaCorrente[i].getNumero());
                            System.out.println("Saldo atual: " + df.format(objContaCorrente[i].getSaldo()));
                            break;
                        }
                    }
                    if (!encontrei) {
                        System.out.println("\nConta não cadastrada!");
                    }
                    break;
                case 4:
                    System.out.println("\nNúmero da conta:        Saldo: ");
                    for (int i = 0; i < objContaCorrente.length ; i++) {
                        System.out.println(objContaCorrente[i].getNumero() + "                      " + df.format(objContaCorrente[i].getSaldo()));
                    }
                    break;
                    
                default:
                    break;
            }
        } while (opcao < 5);

    }
}
