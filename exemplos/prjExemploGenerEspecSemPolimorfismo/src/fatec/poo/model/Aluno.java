package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public class Aluno extends Pessoa { 
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, String dataNascimento) {
        super(nome, dataNascimento); //representação da chamada do metodo construtor da super classe Pessoa
        //para que o aluno possa acessar os atributos da classe Pessoa.
        this.regEscolar = regEscolar;
    }  

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

}
