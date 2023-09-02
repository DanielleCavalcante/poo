
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author Danielle
 */
public class Aplic {   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        String unidade;
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
 
        Circulo objCirc = new Circulo(unidade);
        
        
        
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
                System.out.println("\nMedida do raio do circulo: " + objCirc.getRaio() + " " + objCirc.getUnidadeMedida());                
                System.out.println("Medida da área: " + objCirc.calcArea() + " "+ objCirc.getUnidadeMedida() + "²");
            }else
               if (opcao == 2){
                   System.out.println("\nMedida do raio do circulo: " + objCirc.getRaio() + " " + objCirc.getUnidadeMedida());               
                   System.out.println("Medida do perímetro: " + objCirc.calcPerimetro() + " " + objCirc.getUnidadeMedida());
               }else
                   if (opcao == 3){
                      System.out.println("\nMedida do raio do circulo: " + objCirc.getRaio() + " " + objCirc.getUnidadeMedida());  
                      System.out.println("Medida do diâmetro: " + objCirc.calcDiametro() + " " + objCirc.getUnidadeMedida());
               }
        }while(opcao < 4);
    }
}