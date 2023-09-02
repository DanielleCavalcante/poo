
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        
        double medAlt, medBase;
        int opcao;
        
        System.out.println("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase); //armazena a medBase digitada no private, atraves do metodo que criamos setBase
        
        do{
            System.out.println("\n\n1 - Consultar área do retângulo");
            System.out.println("2 - Consultar perímetro do retângulo");
            System.out.println("3 - Consultar diagonal do retângulo");
            System.out.println("4 - Sair");
            System.out.println("\n\tDigite sua opção:");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("Medida da área: " + objRet.calcArea());
            }else 
                if (opcao == 2){
                    System.out.println("Medida do perimetro: " + objRet.calcPerimetro());
                }else
                    if (opcao == 3){
                        System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
                    }
        }while(opcao < 4);
    }
}
