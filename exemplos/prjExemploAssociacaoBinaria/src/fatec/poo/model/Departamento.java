
package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios;//DEFININDO uma matriz de ponteiros que apontam para um funcionario, multiplicidade 1..*
    private int numFunc;    
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5]; //CRIAÇÃO de matriz que armazena endereço de todos os funcionarios (criada em função da superclasse)
        numFunc = 0; //criar a matriz no construtor para ser criado no inicio já
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    //tem como parametro de entrada o endereço de um objeto da classe FuncionarioHorista, FuncionarioMensalista, FuncionarioComissionado
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f; //armazenar o end do funcionario em uma matriz
        numFunc ++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde de funcionários: " + numFunc);
        System.out.println("Registro\t\tNome\t\tCargo");
        
        for(int i = 0; i < numFunc; i++){
            System.out.print(funcionarios[i].getRegistro() + "\t\t");
            System.out.print(funcionarios[i].getNome() + "\t\t");
            System.out.println(funcionarios[i].getCargo());
        }
    }
}
