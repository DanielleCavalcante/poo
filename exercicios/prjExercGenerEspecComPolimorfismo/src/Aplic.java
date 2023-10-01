
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;


/**
 *
 * @author danielle
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00"); 
        
        PessoaFisica objPessoaFisica = new PessoaFisica("555.888.999-66", "Juliano Mattos", 2010);
        PessoaJuridica objPessoaJuridica = new PessoaJuridica("48.989.567/0001-07", "DDH - Informática", 2003);
        
        //PESSOA FÍSICA
        objPessoaFisica.setBase(150);
        objPessoaFisica.addCompras(500);
        objPessoaFisica.addCompras(1050);
        objPessoaFisica.addCompras(2500);
        objPessoaFisica.addCompras(8000);
        
        System.out.println("Ano Atual: " + 2023);
        System.out.println("Ano de Inscrição: " + objPessoaFisica.getAnoInscricao());
        System.out.println("CPF: " + objPessoaFisica.getCPF());
        System.out.println("Nome: " + objPessoaFisica.getNome());
        System.out.println("Total de Compras: " + df.format(objPessoaFisica.getTotalCompras()));
        System.out.println("Base:" + df.format(objPessoaFisica.getBase()));
        System.out.println("Bônus: " + df.format(objPessoaFisica.calcBonus(2023)));
        
        //PESSOA JURIDICA
        objPessoaJuridica.setTaxaIncentivo(2);
        objPessoaJuridica.addCompras(20000);
        objPessoaJuridica.addCompras(3500);
        objPessoaJuridica.addCompras(17000);
        
        System.out.println("\nAno Atual: " + 2023);
        System.out.println("Ano de Inscrição: " + objPessoaJuridica.getAnoInscricao());
        System.out.println("CGC: " + objPessoaJuridica.getCGC());
        System.out.println("Nome: " + objPessoaJuridica.getNome());
        System.out.println("Total de Compras: " + df.format(objPessoaJuridica.getTotalCompras()));
        System.out.println("Taxa de Incentivo:" + objPessoaJuridica.getTaxaIncentivo() + "%");
        System.out.println("Bônus: " + df.format(objPessoaJuridica.calcBonus(2023)));
    }
    
}
