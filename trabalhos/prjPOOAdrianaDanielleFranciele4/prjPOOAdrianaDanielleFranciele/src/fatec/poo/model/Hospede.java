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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    // AddRegistro
    public void addRegistro(Registro r) {
      registro.add(r); //usar o this
      r.setHospede(this);
    }
    
    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");  // Remove caracteres não numéricos do CPF
        
        
        if (cpf.length() != 11) { // Verifica se o CPF possui 11 dígitos
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }

        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito == 10 || primeiroDigito == 11) {
            primeiroDigito = 0;
        }

        // Verifica o primeiro dígito verificador
        if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigito) {
            return false;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }

        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito == 10 || segundoDigito == 11) {
            segundoDigito = 0;
        }

        // Verifica o segundo dígito verificador
        return Character.getNumericValue(cpf.charAt(10)) == segundoDigito;
    }
}
