
import fatec.poo.model.Retangulo; //para conseguir utilizar a classe criada (visto que estão em pastas diferentes)

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet; //criação do ponteiro (nome da classe + identificador)
        
        objRet = new Retangulo(); //Instanciação do objeto da classe Retangulo
        
        //passagem de mensagens - solicitar execução de um método previamente defindido
        objRet.setAltura(3.0); //coloca o valor, onde lá na classe criamos um parametro double
        objRet.setBase(4.0); 
        
        System.out.println("Medida da Altura do Retangulo: " + objRet.getAltura()); //get para conseguir puxar o dado armazenado no atributo
        System.out.println("Medida da base do retangulo: " + objRet.getBase());
        
        System.out.println("Medida da Área: " + objRet.calcArea()); //conseguir armazenar  os valores do set no calcArea
        System.out.println("Medida do Perimetro: " + objRet.calcPerimetro());
        System.out.println("Medida da Diagonal: " + objRet.calcDiagonal());
    }
    
}
