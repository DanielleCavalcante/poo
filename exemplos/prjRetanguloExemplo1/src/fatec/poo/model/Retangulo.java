package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){
        altura = a;
    }
    public double getAltura(){
        return altura;
    }
    public void setBase(double b){
        base = b;
    }
    public double getBase(){
       return base;
    }
    public double calcArea(){
        return(altura * base);
    }
    public double calcPerimetro(){
        return(2 * (altura + base));
    }   
    //faça o cálculo da diagonal (utilizando pitágoras)
    public double calcDiagonal(){
        return (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2))); //diagonal = raiz(base^2+altura^2) pitagoras
        //sqrt é para calcular raiz e pow para calcular potencia (base, expoente)
    }
    
}
