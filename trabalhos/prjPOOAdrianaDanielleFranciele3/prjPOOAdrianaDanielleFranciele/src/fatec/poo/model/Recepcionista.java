package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Adriana, Danielle e Franciele
 */

public class Recepcionista extends Pessoa{
    private int regFunc;
    private String turno;
    
    ArrayList<Registro> registro = new ArrayList<Registro>(); //multiplicidade 1..* - um recepcionista pode registrar diversos hospedes

    public Recepcionista(int regFunc, String nome) { //metodo construtor que recebe parametros do registro e nome
        super(nome);
        this.regFunc = regFunc;
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
}
