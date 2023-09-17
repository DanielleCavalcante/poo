package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public class Cliente extends Pessoa {
    private String CPF;
    private double peso;
    private double altura;

    public Cliente(String cpf, String nome, String telefone) {
        super(nome, telefone);
        this.CPF = cpf;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCPF() {
        return CPF;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    public double calcIMC(){
        return(peso/Math.pow(altura,2));
    }
}