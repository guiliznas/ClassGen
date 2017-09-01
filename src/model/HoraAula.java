package model;

import java.sql.Time;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class HoraAula {
    private int id;
    private Time horaInicio;
    private Time horaFim;

    public HoraAula() {
    }

    public HoraAula(Time horaInicio, Time horaFim) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public HoraAula(int id, Time horaInicio, Time horaFim) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }
    
}
