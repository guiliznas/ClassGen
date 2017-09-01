package model;

import java.sql.Date;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class Aluno {
    private int id;
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private Date dataNascimento;
    private String numeroMatricula;
    private String email;
    private String celular;
    private String pai;
    private String mae;

    public Aluno(int id, String nome, String cpf, String login, String senha, Date dataNascimento, String numeroMatricula, String email, String celular, String pai, String mae) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
        this.email = email;
        this.celular = celular;
        this.pai = pai;
        this.mae = mae;
    }

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String login, String senha, Date dataNascimento, String numeroMatricula, String email, String celular, String pai, String mae) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
        this.email = email;
        this.celular = celular;
        this.pai = pai;
        this.mae = mae;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }
    
}
