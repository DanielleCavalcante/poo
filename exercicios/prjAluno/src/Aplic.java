
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        //instanciando objetos necessários
        Aluno objAluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        //criação de variaveis para o scanner
        int Ra, opcao;
        //se utilziar objAluno.SetVarivel(entrada.nextdouble); tem não vai ser necessário criar essas variaveis
        double NtPrv1, NtPrv2, NtTrab1, NtTrab2;
        
        //entrada de dados
        System.out.println("Digite o RA: ");
        Ra = entrada.nextInt();
        //objAluno.setRA(entrada.nextInt());
        System.out.println("Digite a nota da primeira prova: ");
        NtPrv1 = entrada.nextDouble();
        //objAluno.setNtPrv1(entrada.nextInt());
        System.out.println("Digite a nota da segunda prova: ");
        NtPrv2 = entrada.nextDouble();
        //objAluno.setNtPrv2(entrada.nextInt());
        System.out.println("Digite a nota do primeiro trabalho: ");
        NtTrab1 = entrada.nextDouble();
        //objAluno.setTrab1(entrada.nextInt());
        System.out.println("Digite a nota do segundo trabalho: ");
        NtTrab2 = entrada.nextDouble();
        //objAluno.setTrab2(entrada.nextInt());
        
        //armazenando dados digitados no private
        objAluno.setRA(Ra);
        objAluno.setNtPrv1(NtPrv1);
        objAluno.setNtPrv2(NtPrv2);
        objAluno.setNtTrab1(NtTrab1);
        objAluno.setNtTrab2(NtTrab2);
        
        do{
            System.out.println("\n\n1 - Exibir notas das provas/trabalhos");
            System.out.println("2 - Exibir média dos trabalhos/provas");
            System.out.println("3 - Exibir méda final");
            System.out.println("4 - Sair");
            System.out.println("\n\tDigite sua opção:");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\n\nRA:" + objAluno.getRa() + 
                        "\nNota Prova 1: " + objAluno.getNtPrv1() + "\nNota Prova 2: " + objAluno.getNtPrv2() + "\n" +
                        "Nota Trabalho 1 " + objAluno.getNtTrab1() + "\nNota Trabalho 2: " + objAluno.getNtTrab2());
            }else 
                if (opcao == 2){
                    System.out.println("\n\nRA:" + objAluno.getRa() + 
                        "\nMédia das provas:" + objAluno.calcMediaProva() + "\nMédia dos Trabalhos: " + objAluno.calcMediaTrab());
                }else
                    if (opcao == 3){
                        System.out.println("Média Final: " + objAluno.calcMediaFinal());
                    }
        }while(opcao < 4);
    }
}
