
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        //Circulo objCirc;
        Scanner entrada = new Scanner(System.in);
        
        Circulo objCirc = new Circulo();
        
        double raio;
        //int opcao era para colocar opções
        
        System.out.println("Digite a medida do raio do círculo: ");
        raio = entrada.nextDouble();
        
        objCirc.setRaio(raio); //necessário para armazenar o valor digitado do raio no private raio
        
        System.out.println("Medida do raio do Circulo: " + objCirc.getRaio()); //get para conseguir puxar o dado armazenado no atributo
        
        System.out.println("Medida da área: " + objCirc.calcArea()); //conseguir armazenar  os valores do set no calcArea
        System.out.println("Medida do perimetro: " + objCirc.calcPerimetro());
        System.out.println("Medida da diametro: " + objCirc.calcDiametro());
    }
}
