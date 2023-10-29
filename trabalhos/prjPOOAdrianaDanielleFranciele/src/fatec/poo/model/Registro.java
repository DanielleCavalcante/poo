package fatec.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author danielle
 */
public class Registro{
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    private Recepcionista recepcionista; //multiplicidade 1 - um registro pode ter sido feito por um recepcionista
    private Hospede hospede; //multiplicidade 1 - um registro pode ter apenas um hospede 
    private Quarto quarto; //multiplicidade 1 - um registro aponta apenas para um quarto
    private ArrayList<ServicoQuarto> servicoquarto; //multiplicidade 1..* - um registro pode possui diversos serviços de quarto

    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista) { //parametro de entrada o código, data de entrada e o recepcionista
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
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
        this.quarto.reservar(); //não sei se está certo
    }
    
    public double liberarQuarto(int dias){
        //+ valor da hospedagem do quarto, - a taxa de desconto se o hospede tiver + servicos de quarto
    }
}
