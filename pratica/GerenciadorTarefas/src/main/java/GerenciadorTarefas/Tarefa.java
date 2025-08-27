package GerenciadorTarefas;

import java.util.Date;

public class Tarefa {

    private String nome;
    private String descricao;
    private Boolean concluida;
    private Date dataCriacao;
    private Date dataConclusao;

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = false;
        this.dataCriacao = new Date();
        this.dataConclusao = null;
    }

    public Date getDataCriacao() {
        return this.dataCriacao;
    }

    public void concluir() {
        this.dataConclusao = new Date();
        this.concluida = true;
    }

    public Boolean estaConcluida() {
        return this.concluida;
    }
}
