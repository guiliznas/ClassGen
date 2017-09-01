package model;

import java.sql.Date;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class Professor {
    private int id;
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private Date dataNascimento;
    private String email;
    private String celular;
    private String registro;

    public Professor() {
    }

    public Professor(String nome, String cpf, String login, String senha, Date dataNascimento, String email, String celular, String registro) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.celular = celular;
        this.registro = registro;
    }

    public Professor(int id, String nome, String cpf, String login, String senha, Date dataNascimento, String email, String celular, String registro) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.celular = celular;
        this.registro = registro;
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    
}
