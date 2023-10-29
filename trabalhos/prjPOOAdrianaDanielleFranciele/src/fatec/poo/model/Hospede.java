package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author danielle
 */
public class Hospede extends Pessoa {
   private String cpf;
   private double taxaDesconto;
   private ArrayList<Registro> registro; //multiplicidade 1..* - um hospede pode ter varios registros

    public Hospede(String cpf, String nome) { //recebe como parametros o cpf do hospede e o nome
        super(nome);
        this.cpf = cpf;
    }

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
