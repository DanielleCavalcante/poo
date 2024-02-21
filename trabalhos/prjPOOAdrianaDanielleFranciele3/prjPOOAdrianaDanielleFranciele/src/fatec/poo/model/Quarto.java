package fatec.poo.model;

/**
 *
 * @author Adriana, Danielle e Franciele
 */

public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado;

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo; //s - solteito, D - casado
        this.valorDiaria = valorDiaria;
    }
    
    public void reservar(){
        situacao = true; //quarto reservado
    }
    
    public double liberar(int dias){ //qtde de dias que o hospede ficou no quarto
        situacao = false; //quarto volta para situação livre
        totalFaturado += dias * valorDiaria;
        return dias * valorDiaria;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
}
