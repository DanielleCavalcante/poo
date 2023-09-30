package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public abstract class Funcionario { //se tiver alguma método abstrato dentro da classe, tem que colocar abstract no inicio
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    abstract public double calcSalBruto(); //abstract pode ser antes ou depois do public
    //esse metodo será implementado de acordo com o metodo das subclasses
    //se a operação for igual pode ser implementado na superclasse
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
     public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }

    public void setCargo(String cargo) { //em vez de alterar, adicionar (efeito dominó)
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }
}