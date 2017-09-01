package model;

import java.util.ArrayList;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class Turma {
    private int id;
    private Nivel nivel;
    private Sala sala;
    private ArrayList<Aluno> alunos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Chamada> chamadas;
    private ArrayList<Atividade> atividades;
    private GradeHorario gradeHorario;
    private String codigo;

    public Turma(int id, Nivel nivel, Sala sala, String codigo) {
        this.id = id;
        this.nivel = nivel;
        this.sala = sala;
        this.codigo = codigo;
    }

    public Turma(Nivel nivel, Sala sala, String codigo) {
        this.nivel = nivel;
        this.sala = sala;
        this.codigo = codigo;
    }

    public Turma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public ArrayList<Chamada> getChamadas() {
        return chamadas;
    }

    public void setChamadas(ArrayList<Chamada> chamadas) {
        this.chamadas = chamadas;
    }
    
    public void addChamada(Chamada chamada){
        this.chamadas.add(chamada);
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }
    
    public void addAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }

    public GradeHorario getGradeHorario() {
        return gradeHorario;
    }

    public void setGradeHorario(GradeHorario gradeHorario) {
        this.gradeHorario = gradeHorario;
    }
    
}
