package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public class Circulo {
    private double raio;
    private String unidadeMedida;
    
    public Circulo(String uniMed){
        unidadeMedida = uniMed;
    }
    
    public void setRaio(double r){
        raio = r;
    }
    
    public double getRaio(){
        return raio;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
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
