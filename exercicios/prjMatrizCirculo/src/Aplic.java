
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
        Circulo[] matCirc = new Circulo[10]; 
        
        //ENTRADA DE DADOS
        for(int i = 0; i < matCirc.length ; i++){    
            System.out.println("\nCírculo " + (i+1) + ":");
            System.out.print("Digite a unidade de medida: ");
            unidade = entrada.next();
            
            //instanciando os objetos
            matCirc[i] = new Circulo(unidade); 
            
            System.out.print("Digite o valor do raio: ");
            raio = entrada.nextDouble();
            
            //passando parâmetros
            matCirc[i].setRaio(raio); 
        }
        
        //SAÍDA DE DADOS
        for(int i = 0; i < matCirc.length; i++){
            System.out.println("\nCírculo " + (i+1) + ":");
            System.out.println("Área: " + df.format(matCirc[i].calcArea()) + " " + matCirc[i].getUnidadeMedida());
            System.out.println("Perímetro: " + df.format(matCirc[i].calcPerimetro()) + " " + matCirc[i].getUnidadeMedida());
            System.out.println("Diâmetro: " + df.format(matCirc[i].calcDiametro()) + " " + matCirc[i].getUnidadeMedida());
        }
    }
}
