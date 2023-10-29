package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author danielle
 */
public class Recepcionista extends Pessoa{
    private int regFunc;
    private String turno;
    private ArrayList<Registro> registro; //multiplicidade 1..* - um recepcionista pode registrar diversos hospedes

    public Recepcionista(int regFunc, String nome) { //metodo construtor que recebe parametros do registro e nome
        super(nome);
        this.regFunc = regFunc;
    }

    public void setTurno(String turno) { //manha, tarde, noite
        this.turno = turno;
    }

    public int getRegFunc() { //retorna o registro do(a) recepcionista
        return regFunc;
    }

    public String getTurno() { //retorna o turno do(a) recepcionista
        return turno;
    }
    
}
