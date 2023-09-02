/**
 *
 * @author Danielle
 */
public class Exemplo4 {
    public static void main(String[] args) {
        double numero, resultado;
        
        numero = Math.random() * 100;
        for(int x=1; x<=10; x++){
           resultado = numero * x;
           System.out.println(numero + " x " + x + " = " + resultado);
        }
    }
}
