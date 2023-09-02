
import fatec.poo.model.Circulo;
import java.util.Scanner;



/**
 *
 * @author Dimas
 */
public class Aplic {   
    public static void main(String[] args) {
        Circulo objCirc = new Circulo(); //Instanciação do objeto
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        
        //Montar o Retangulo
        System.out.println("Digite a medida do raio do circulo: ");
        medRaio = entrada.nextDouble();
        
        objCirc.setRaio(medRaio); //passagem de mensagens
        
        do{
            System.out.println("\n\n1-Consultar área do circulo");
            System.out.println("2-Consultar perímetro do circulo");
            System.out.println("3-Consultar diâmetro do retângulo");
            System.out.println("4-Sair");
            System.out.print("\n\tDigite a opção: ");            
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\nMedida do raio do circulo: " + objCirc.getRaio());                
                System.out.println("Medida da área: " + objCirc.calcArea());
            }else
               if (opcao == 2){
                   System.out.println("\nMedida do raio do circulo: " + objCirc.getRaio());               
                   System.out.println("Medida do perímetro: " + objCirc.calcPerimetro());
               }else
                   if (opcao == 3){
                      System.out.println("\nMedida do raio do circulo: " + objCirc.getRaio());  
                      System.out.println("Medida do diâmetro: " + objCirc.calcDiametro());
               }
        }while(opcao < 4);
    }
}
