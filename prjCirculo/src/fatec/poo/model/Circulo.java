package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double a){
        raio = a;
    }
    public double getRaio(){
        return raio;
    }
    public double calcArea(){
        return(3.1416 * Math.pow(raio ,2));
    }
    public double calcPerimetro(){
        return((2 * 3.1416) * raio);
    }
    public double calcDiametro(){
        return(2 * raio);
    }
}
