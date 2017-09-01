package model;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
class Frequencia {
    private int id;
    private boolean presente;
    private Aluno aluno;

    public Frequencia() {
    }

    public Frequencia(boolean presente, Aluno aluno) {
        this.presente = presente;
        this.aluno = aluno;
    }

    public Frequencia(int id, boolean presente, Aluno aluno) {
        this.id = id;
        this.presente = presente;
        this.aluno = aluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
