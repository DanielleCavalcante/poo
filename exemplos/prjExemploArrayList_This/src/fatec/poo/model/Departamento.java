
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private ArrayList<Funcionario> funcionarios; //multiplicidade 1..*
    private int numFunc; 
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new  ArrayList<Funcionario>(); //intanciado obj ArrayList que pode armazenar obj da classe Funcionario
    }

    public String getSigla() { 
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){//f recebe o end de um funcionario
        funcionarios.add(f); //insere o objeto funcionário horista, mensalista, comissionado no ArrayList. ADD é do java.util 
                             //departamento aponta para o funcionario
        f.setDepartamento(this);//o funcionario aponta para um departameto
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. Funcionários: " + funcionarios.size() ); //mostra o tamanho do arraylist, a qtde de objetos
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for (int x = 0; x < funcionarios.size(); x++){
            System.out.print(funcionarios.get(x).getRegistro() + "\t\t");
            System.out.print(funcionarios.get(x).getNome() + "\t\t");
            System.out.println(funcionarios.get(x).getCargo()); //get é do ArrayList
        }
    }
}
