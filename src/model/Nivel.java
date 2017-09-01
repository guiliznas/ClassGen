package model;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class Nivel {
    private int id;
    private String nome;
    private String descricao;
    private double mediaAprovacao;

    public Nivel() {
    }

    public Nivel(String nome, String descricao, double mediaAprovacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.mediaAprovacao = mediaAprovacao;
    }

    public Nivel(int id, String nome, String descricao, double mediaAprovacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.mediaAprovacao = mediaAprovacao;
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

    public double getMediaAprovacao() {
        return mediaAprovacao;
    }

    public void setMediaAprovacao(double mediaAprovacao) {
        this.mediaAprovacao = mediaAprovacao;
    }
    
    
}
