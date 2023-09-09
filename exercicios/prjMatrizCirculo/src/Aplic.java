
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author danielle
 */
public class Aplic {
    public static void main(String[] args) {
        //DECLARAÇÃO DE VARIAVEIS E INSTANCIAÇÃO DE OBJETOS
        DecimalFormat df = new DecimalFormat("0.00"); //classe java util
        Scanner entrada = new Scanner(System.in);  
        String unidade; //para receber a unidade digitada
        double raio; //para receber o raio
        
        //definição da matriz
        Circulo[] objCirculo = new Circulo[10]; 
        
        //ENTRADA DE DADOS
        for(int i = 0; i < 10; i++){    
            System.out.println("\nCírculo " + (i+1) + ":");
            System.out.print("Digite a unidade de medida: ");
            unidade = entrada.next();
            
            //instanciando os objetos
            objCirculo[i] = new Circulo(unidade); 
            
            System.out.print("Digite o valor do raio: ");
            raio = entrada.nextDouble();
            
            //passando parâmetros
            objCirculo[i].setRaio(raio); 
        }
        
        //SAÍDA DE DADOS
        for(int i = 0; i < 10; i++){
            System.out.println("\nCírculo " + (i+1) + ":");
            System.out.println("Área: " + df.format(objCirculo[i].calcArea()) + " " + objCirculo[i].getUnidadeMedida());
            System.out.println("Perímetro: " + df.format(objCirculo[i].calcPerimetro()) + " " + objCirculo[i].getUnidadeMedida());
            System.out.println("Diâmetro: " + df.format(objCirculo[i].calcDiametro()) + " " + objCirculo[i].getUnidadeMedida());
        }
    }
}
