/**
 *
 * @author Danielle
 */
public class Exemplo3 {
    public static void main(String[] args) {
        double numero;
        
        numero = Math.random() * 100; //pois o random é entre 0 e 1, então multiplicando deixa o numero "normal"
        
        if(numero > 50){
            System.out.println("O número " + numero + " é maior que 50");
        }else{
            System.out.println("O número " + numero + " é maior ou igual a 50");
        }
    }
}
