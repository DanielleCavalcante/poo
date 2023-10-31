package fatec.poo.model;

/**
 *
 * @author Adriana, Danielle e Franciele.
 */

public class ServicoQuarto {
    private int codigo;
    private String descricao;
    private double valor;
    private Registro registro; //multiplicidade 1 - aponta para um registro

    public ServicoQuarto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
    
}
