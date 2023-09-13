import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Aluno objAluno = new Aluno (1010, "Carlos Silveira", "15/03/1978");
        Professor objProfessor = new Professor (1111, "Fernando Ribeiro", "30/04/1972");
        
        objAluno.setMensalidade(1500);
        System.out.println("Registro escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        objProfessor.setSalario(20000);
        System.out.println("\n\nRegistro funcionários: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objProfessor.getSalario()));
    }
    
}
