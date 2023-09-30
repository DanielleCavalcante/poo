
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author Danielle
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        FuncionarioHorista funHor = new FuncionarioHorista (1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista funMen = new FuncionarioMensalista (1011, "Henrique Silva", "09/10/1972", 1320);
        FuncionarioComissionado funCom = new FuncionarioComissionado (1012, "Danilo Silva", "10/10/1999", 0.30);
         
        //HORISTA
        funHor.setQtdeHorTrab(90);
        funHor.setCargo("Estagiario");
        System.out.println("Registro: " + funHor.getRegistro());
        System.out.println("Nome: " + funHor.getNome());
        System.out.println("Data Admissão: " + funHor.getDtAdmissao());
        System.out.println("Cargo: " + funHor.getCargo());
        System.out.println("Salário Bruto => " + df.format(funHor.calcSalBruto()));
        System.out.println("Desconto => " + df.format(funHor.calcDesconto()));
        System.out.println("Salário Líquido => " + df.format(funHor.calcSalLiquido()));
        System.out.println("Gratificação => " + df.format(funHor.calcGratificacao()));
        
        //MENSALISTA
        funMen.setNumSalMin(1);
        funMen.setCargo("Jovem Aprendiz");
        System.out.println("\nRegistro: " + funMen.getRegistro());
        System.out.println("Nome: " + funMen.getNome());
        System.out.println("Data Admissão: " + funMen.getDtAdmissao());
        System.out.println("Cargo: " + funMen.getCargo());
        System.out.println("Salário Bruto => " + df.format(funMen.calcSalBruto()));
        System.out.println("Desconto => " + df.format(funMen.calcDesconto()));
        System.out.println("Salário Líquido => " + df.format(funMen.calcSalLiquido())); //o método calcSalLiquido da classe funcionarioHorista
                                                                                //substitui o método da superclasse (mesmo nome), não herdará
    
        //COMISSIONADO
        funCom.setSalBase(900);
        funCom.setCargo("Vendedor");
        funCom.addVendas(1000);
        funCom.addVendas(3000);
        funCom.addVendas(4000);
        System.out.println("\nRegistro: " + funCom.getRegistro());
        System.out.println("Nome: " + funCom.getNome());
        System.out.println("Data Admissão: " + funCom.getDtAdmissao());
        System.out.println("Cargo: " + funCom.getCargo());
        System.out.println("Salário Base => " + df.format(funCom.getSalBase()));
        System.out.println("Salário Bruto => " + df.format(funCom.calcSalBruto()));
        System.out.println("Desconto => " + df.format(funCom.calcDesconto()));
        System.out.println("Taxa Comissão => " + funCom.getTaxaComissao()*100 +"%");
        System.out.println("Total Vendas => " + df.format(funCom.getTotalVendas()));
        System.out.println("Salário Líquido => " + df.format(funCom.calcSalLiquido()));
    }
}
