package fatec.poo.model;

/**
 *
 * @author Danielle
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao); //chamada di método construtor da super classe Funcionario
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    //aplicar o polimorfismo
    @Override //sobreposição dos métodos da superclasse (não aproveitamento de tudo da superclasse)
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return (calcSalBruto() * 0.075);
    }
    
    //Aplicação do polimorfismo para atender os novos requisitos
    @Override
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}