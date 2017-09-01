package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class Atividade {
    private int id;
    private String nome;
    private String descricao;
    private Disciplina disciplina;
    private ArrayList<Nota> notas;
    private Date dataEntrega;

    public Atividade(int id, String nome, String descricao, Disciplina disciplina, ArrayList<Nota> notas, Date dataEntrega) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.disciplina = disciplina;
        this.notas = notas;
        this.dataEntrega = dataEntrega;
    }

    public Atividade() {
    }

    public Atividade(String nome, String descricao, Disciplina disciplina, ArrayList<Nota> notas, Date dataEntrega) {
        this.nome = nome;
        this.descricao = descricao;
        this.disciplina = disciplina;
        this.notas = notas;
        this.dataEntrega = dataEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
}
