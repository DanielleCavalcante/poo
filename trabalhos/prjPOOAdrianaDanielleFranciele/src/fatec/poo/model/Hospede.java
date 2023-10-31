package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Adriana, Danielle e Franciele.
 */

public class Hospede extends Pessoa {
   private String cpf;
   private double taxaDesconto;

    public Hospede(String cpf, String nome) {//recebe como parametros o cpf do hospede e o nome
        super(nome);
        this.cpf = cpf;
    }
    
    ArrayList<Registro> registro = new ArrayList<Registro>(); //multiplicidade 1..* - um hospede pode ter varios registros

    public void setTaxaDesconto(double taxaDesconto) { //recebe a taxa de desconto em %
        this.taxaDesconto = taxaDesconto; //100
    }

    public String getCpf() { //retorna o cpf do hospede
        return cpf;
    }

    public double getTaxaDesconto() { //retorna a taxa de desconto
        return taxaDesconto;
    }  
}
