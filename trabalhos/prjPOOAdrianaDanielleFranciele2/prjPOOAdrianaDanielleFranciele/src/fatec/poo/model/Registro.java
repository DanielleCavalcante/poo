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

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public double getValorHospedagem() {
        return valorHospedagem;
    }
    
    public void reservarQuarto(Hospede hospede, Quarto quarto){ //recebe o endereço de um hospede e de um quarto
        this.hospede = hospede;
        this.quarto = quarto;
        quarto.reservar();
    }
    
    public double liberarQuarto(){
        int diasHospedagem = dataEntrada.until(dataSaida).getDays();
        double valorDiaria = quarto.getValorDiaria();
        double valorTotalDiarias = diasHospedagem * valorDiaria;
        double valorTotalServicos = 0.0;

        for (int i = 0; i < servicoquarto.size(); i++) {
            valorTotalServicos += servicoquarto.get(i).getValor();
        }

        valorHospedagem = valorTotalDiarias + valorTotalServicos;
        if (hospede != null) {
            double desconto = hospede.getTaxaDesconto() / 100.0;
            valorHospedagem *= (1 - desconto);
        }

        quarto.liberar(diasHospedagem);

        return valorHospedagem;
    }
}
