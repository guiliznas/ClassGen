package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class Chamada {
    private int id;
    private Date data;
    private ArrayList<Frequencia> frequencias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Frequencia> getFrequencias() {
        return frequencias;
    }

    public void setFrequencias(ArrayList<Frequencia> frequencias) {
        this.frequencias = frequencias;
    }
    
    public void addFrequencia(Frequencia frequencia){
        this.frequencias.add(frequencia);
    }
    
}
