/**
 *
 * @author 0030482213030
 */
public class Exemplo2 {
    public static void main(String[] args) {
        int idade;
        double altura;
        char sexo;
        String nome;
        
        idade = 27;
        altura = 1.75;
        sexo = 'M';
        nome = "Pedro Silveira";
        
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura); //não se pode concatenar String com dados numéricos, 
        //porém será feito uma conversão do dado inteiro 27 para a String 27
    }
}
