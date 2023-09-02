package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public class ContaCorrente{
    private int numero;
    private double saldo;
    
    public ContaCorrente(int num, double sld){ 
        numero = num;
        saldo = sld;
    }
        
    public int getNumero(){ //puxa os dados do private
        return (numero);
    }

    public double getSaldo() {
        return (saldo);
    }
    
    public void sacar(double v){
        saldo = saldo - v; 
    }
    
    public void depositar(double v){
        saldo = saldo + v;
    }

}