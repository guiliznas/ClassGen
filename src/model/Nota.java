package model;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
class Nota {
    private int id;
    private double nota;
    private Aluno aluno;

    public Nota(int id, double nota, Aluno aluno) {
        this.id = id;
        this.nota = nota;
        this.aluno = aluno;
    }

    public Nota(double nota, Aluno aluno) {
        this.nota = nota;
        this.aluno = aluno;
    }

    public Nota() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
}
