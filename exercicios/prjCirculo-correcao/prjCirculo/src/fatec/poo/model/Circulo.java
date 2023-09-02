package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double r){
        raio = r;
    }      
    public double getRaio(){
        return(raio);
    }    
    public double calcArea(){
        return (Math.PI * Math.pow(raio, 2));
    }    
    public double calcPerimetro(){
        return (2 * Math.PI * raio);
    }
    public double calcDiametro(){
        return(2 * raio);
    }
}  
