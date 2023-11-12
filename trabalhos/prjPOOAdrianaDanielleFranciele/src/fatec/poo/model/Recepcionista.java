package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Adriana, Danielle e Franciele
 */

public class Recepcionista extends Pessoa{
    private int regFunc;
    private String turno;
    
    //ArrayList de Registro definido como atributo privado
    private ArrayList<Registro> registro;

    public Recepcionista(int regFunc, String nome) { //metodo construtor que recebe parametros do registro e nome
        super(nome);
        this.regFunc = regFunc;
        this.registro = new ArrayList<Registro>(); //instanciação dentro do construtor
    }

    public void setTurno(String turno) { //M-manha, T-tarde, N-noite
        this.turno = turno;
    }

    public int getRegFunc() { //retorna o registro do(a) recepcionista
        return regFunc;
    }

    public String getTurno() { //retorna o turno do(a) recepcionista
        return turno;
    } 
    
    //método addRegistro para efetivar a associação binária entre Recepcionista e Registro
    public void addRegistro(Registro registro) {
        this.registro.add(registro);
        registro.setRecepcionista(this); //this para simplificar a associação
    }
}
