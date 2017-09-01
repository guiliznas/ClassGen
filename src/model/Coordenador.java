package model;

import java.sql.Date;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class Coordenador {
    private int id;
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private Date dataNascimento;
    private String celular;
    private String email;
    private Escola escola;

    public Coordenador(int id, String nome, String cpf, String login, String senha, Date dataNascimento, String celular, String email, Escola escola) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.email = email;
        this.escola = escola;
    }

    public Coordenador(String nome, String cpf, String login, String senha, Date dataNascimento, String celular, String email, Escola escola) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.email = email;
        this.escola = escola;
    }

    public Coordenador() {
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
    
}
