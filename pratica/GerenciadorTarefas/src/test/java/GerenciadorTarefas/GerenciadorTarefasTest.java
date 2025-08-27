package GerenciadorTarefas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GerenciadorTarefasTest {

    @Test
    public void testAdd() {
        GerenciadorTarefas gt = new GerenciadorTarefas();

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            1
        );

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            1
        );

        assertEquals(1, gt.listarTarefas().size());
    }

    @Test
    public void testRem() {
        GerenciadorTarefas gt = new GerenciadorTarefas();

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            1
        );

        gt.removerTarefa(1);

        assertEquals(0, gt.listarTarefas().size());
    }

    @Test
    public void testConcluirTodasTarefas() {
        GerenciadorTarefas gt = new GerenciadorTarefas();

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            1
        );

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            2
        );

        gt.concluirTarefa(1);
        gt.concluirTarefa(2);

        assertEquals(2, gt.listarTarefasConcluidas().size());
    }

    @Test
    public void testTarefaConcluida() {
        GerenciadorTarefas gt = new GerenciadorTarefas();

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            1
        );

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            2
        );

        gt.concluirTarefa(1);

        assertEquals(1, gt.listarTarefasConcluidas().size());
    }

    @Test
    public void testTarefaNaoConcluida() {
        GerenciadorTarefas gt = new GerenciadorTarefas();

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            1
        );

        gt.adicionarTarefa(
            new Tarefa("Nova tarefa", "Descrição da nova tarefa"),
            2
        );

        gt.concluirTarefa(1);

        assertEquals(1, gt.listarTarefasPendentes().size());
    }
}
