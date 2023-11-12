package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Adriana, Danielle e Franciele.
 */

public class Hospede extends Pessoa {
    private String cpf;
    private double taxaDesconto;
    private ArrayList<Registro> registro; // ArrayList como atributo privado

    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
        this.registro = new ArrayList<>(); // Instanciando o ArrayList no construtor
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }    

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    // AddRegistro
    public void addRegistro(Registro r) {
    registro.add(r); //usar o this
    r.setHospede(this); // o hospede aponta para um registro
    }
}
