package fatec.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Adriana, Danielle e Franciele
 */

public class Registro{
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    private Recepcionista recepcionista; //multiplicidade 1 - um registro pode ter sido feito por um recepcionista
    private ArrayList<ServicoQuarto> servicoquarto; //multiplicidade 1..* - um registro pode possui diversos serviços de quarto 
    private Hospede hospede; //multiplicidade 1 - um registro pode ter apenas um hospede 
    private Quarto quarto; //multiplicidade 1 - um registro aponta apenas para um quarto
    
    
    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista){//parametro de entrada o código, data de entrada e o recepcionista
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
        this.servicoquarto = new ArrayList<ServicoQuarto>();
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    
    public void setRecepcionista(Recepcionista recepcionista) { //para poder usar no addRegistro da classe recepcionista
        this.recepcionista = recepcionista;
    }
    
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setValorHospedagem(double valorHospedagem) {
        this.valorHospedagem = valorHospedagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }
    
    //métodos get's para Hospede, Recepcionista e Quarto
    public Hospede getHospede() {
        return hospede;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public Quarto getQuarto() {
        return quarto;
    }
    
    public void reservarQuarto(Hospede hospede, Quarto quarto){ //recebe o endereço de um hospede e de um quarto
        this.hospede = hospede; //registro --> hospede
        hospede.addRegistro(this); //hospede --> registro
        this.quarto = quarto;
        quarto.reservar();
    }
    
    public double liberarQuarto(){   
        int diasHospedagem = dataEntrada.until(dataSaida).getDays();
        
        valorHospedagem = quarto.liberar(diasHospedagem); //o método liberar já retorna o valor da hospedagem, não precisa calcular de novo
        
        double valorTotalServicos = 0.0;

        for (int i = 0; i < servicoquarto.size(); i++) { //percorrer os serviços de quarto na lista
            valorTotalServicos += servicoquarto.get(i).getValor();
        }
        double valorDesconto = 0.0;
        double desconto = hospede.getTaxaDesconto() / 100.0;
        valorDesconto = valorHospedagem * desconto;
        // Subtrai o valor do desconto do total da hospedagem
        valorHospedagem -= valorDesconto;
        
        valorHospedagem += valorTotalServicos;
        return valorHospedagem;
    }
}
