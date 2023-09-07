
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        Circulo objCirc;
        Scanner entrada = new Scanner(System.in);
        
        objCirc = new Circulo();
        
        double raio;
        
        System.out.println("Digite a medida do raio do círculo: ");
        raio = entrada.nextDouble();
        
        System.out.println("Medida da área: " + objCirc.calcArea()); //conseguir armazenar  os valores do set no calcArea
        System.out.println("Medida do perimetro: " + objCirc.calcPerimetro());
        System.out.println("Medida da diametro: " + objCirc.calcDiametro());
    }
}
