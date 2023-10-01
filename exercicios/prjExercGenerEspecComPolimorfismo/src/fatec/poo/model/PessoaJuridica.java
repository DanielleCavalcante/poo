package fatec.poo.model;

/**
 *
 * @author danielle
 */
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String cgc, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }
    
    @Override
    public double calcBonus(int anoAtual){
        return (anoAtual - getAnoInscricao()) * (taxaIncentivo/100 * getTotalCompras());
    }

    public void setTaxaIncentivo(double taxaIncentivo) { //em %
        this.taxaIncentivo = taxaIncentivo;
    }

    public String getCGC() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }
    
}
