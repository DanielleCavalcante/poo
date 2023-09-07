
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dimas 
 */
public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("0.0");
       Scanner entrada = new Scanner(System.in);       
       String unidade;
       double medAlt, medBas;       
       int i;

       //definição de uma matriz de objetos 
       //para classe Retangulo
       Retangulo[] matRet = new Retangulo[3]; //criação do objeto matriz matRet
 
       for (i=0; i < 3; i++){
            System.out.println("\n\nDigite a unidade de medida: ");
            unidade = entrada.next();  
       
            //instanciação do objeto da classe Retangulo
            //e chamada do método construtor
            matRet[i] = new Retangulo(unidade); //criação dos 3 objetos utilizando, com o matRet que já tinha sido inicializado
            
            System.out.println("Digite a medida da altura: ");
            medAlt = entrada.nextDouble();       
            System.out.println("Digite a medida da base: ");
            medBas = entrada.nextDouble(); 
            
            //passagem de mensagens
            matRet[i].setAltura(medAlt);
            matRet[i].setBase(medBas);  
        }     
       
        //acessando matriz de objetos
        for (i=0; i < 3; i++){                         
                                                        //passagem de mensagens
            System.out.println("\n\nObjeto Retangulo " + (i+1)); 
	    System.out.println("\nMedida da altura: " + df.format(matRet[i].getAltura()) + " " + matRet[i].getUnidadeMedida());
            System.out.println("Medida da base: " + df.format(matRet[i].getBase()) + " " + matRet[i].getUnidadeMedida());	
            System.out.println("Área: "  + df.format(matRet[i].calcArea()) + " " + matRet[i].getUnidadeMedida() + "²"); 
            System.out.println("Perímetro: " + df.format(matRet[i].calcPerimetro()) + " " + matRet[i].getUnidadeMedida());
            System.out.println("Diagonal: "  + df.format(matRet[i].calcDiagonal()) + " " + matRet[i].getUnidadeMedida());
        }   		   
    }    
}
