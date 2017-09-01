package model;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class GradeHorario {

    private int id;
    private byte diaSemana;
    private Disciplina disciplina;
    private HoraAula horaAula;

    public GradeHorario(int id, byte diaSemana, Disciplina disciplina, HoraAula horaAula) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.disciplina = disciplina;
        this.horaAula = horaAula;
    }

    public GradeHorario(byte diaSemana, Disciplina disciplina, HoraAula horaAula) {
        this.diaSemana = diaSemana;
        this.disciplina = disciplina;
        this.horaAula = horaAula;
    }

    public GradeHorario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(byte diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public HoraAula getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(HoraAula horaAula) {
        this.horaAula = horaAula;
    }
    
}
