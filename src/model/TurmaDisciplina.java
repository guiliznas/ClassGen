package model;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class TurmaDisciplina {
    private int id;
    private Turma turma;
    private Disciplina disciplina;
    private Aluno aluno;

    public TurmaDisciplina(int id, Turma turma, Disciplina disciplina, Aluno aluno) {
        this.id = id;
        this.turma = turma;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }

    public TurmaDisciplina(Turma turma, Disciplina disciplina, Aluno aluno) {
        this.turma = turma;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }

    public TurmaDisciplina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
