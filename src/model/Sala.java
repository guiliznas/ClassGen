package model;

/**
 *
 * @author(name= Guilherme de Liz, date= 09-01-2017)
 */
public class Sala {
    private int id;
    private Escola escola;
    private String codigo;
    private byte maximoAlunos;
    private boolean funcional;

    public Sala(int id, Escola escola, String codigo, byte maximoAlunos, boolean funcional) {
        this.id = id;
        this.escola = escola;
        this.codigo = codigo;
        this.maximoAlunos = maximoAlunos;
        this.funcional = funcional;
    }

    public Sala(Escola escola, String codigo, byte maximoAlunos, boolean funcional) {
        this.escola = escola;
        this.codigo = codigo;
        this.maximoAlunos = maximoAlunos;
        this.funcional = funcional;
    }

    public Sala() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte getMaximoAlunos() {
        return maximoAlunos;
    }

    public void setMaximoAlunos(byte maximoAlunos) {
        this.maximoAlunos = maximoAlunos;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }
    
}
