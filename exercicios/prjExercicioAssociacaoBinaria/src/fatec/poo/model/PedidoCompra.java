package fatec.poo.model;

/**
 *
 * @author danielle
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    //private Departamento departamento; //criando um ponteiro que aponta para um departamento, multiplicidade 1
    //identificador com Classe indica ponteiro

    public PedidoCompra(int numero) {
        this.numero = numero;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
