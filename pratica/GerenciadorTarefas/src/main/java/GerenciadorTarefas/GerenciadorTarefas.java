package GerenciadorTarefas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorTarefas {

    private Map<Integer, Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new HashMap<>();
    }

    public void adicionarTarefa(Tarefa tarefa, Integer id) {
        tarefas.put(id, tarefa);
    }

    public void removerTarefa(Integer id) {
        tarefas.remove(id);
    }

    public void concluirTarefa(Integer id) {
        tarefas.get(id).concluir();
    }

    public List<Tarefa> listarTarefas() {
        return new ArrayList<>(tarefas.values());
    }

    public List<Tarefa> listarTarefasConcluidas() {
        List<Tarefa> tarefasConcluidas = new ArrayList<>();
        for (Tarefa tarefa : tarefas.values()) {
            if (tarefa.estaConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public List<Tarefa> listarTarefasPendentes() {
        List<Tarefa> tarefasPendentes = new ArrayList<>();
        for (Tarefa tarefa : tarefas.values()) {
            if (!tarefa.estaConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public List<Tarefa> listarTarefasOrdenadas() {
        List<Tarefa> tarefasOrdenadas = new ArrayList<>(tarefas.values());
        tarefasOrdenadas.sort((t1, t2) ->
            t1.getDataCriacao().compareTo(t2.getDataCriacao())
        );
        return tarefasOrdenadas;
    }
}
