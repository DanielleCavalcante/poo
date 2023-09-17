package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public class Instrutor extends Pessoa{
    private int identificacao;
    private String areaAtuacao;

    public Instrutor(int identificacao, String nome, String telefone) {
        super(nome, telefone); //herdou os atributos, porém não pode acessar os atributos de pessoa diretamente
        this.identificacao = identificacao;
    }
    
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }   
}