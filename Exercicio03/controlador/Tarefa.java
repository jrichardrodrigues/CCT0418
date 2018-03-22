package controlador;

import java.util.ArrayList;

public class Tarefa {
    
    private final int id;
    private final String nome;
    private final String descricao;
    private final String prioridade;
    private final boolean status;
    ArrayList<Tarefa> taskL = new ArrayList<Tarefa>();

            
    public Tarefa(int tId, String tNome, String tDescricao, String tPrioridade, boolean tStatus){ 
        this.id = tId;
        this.nome= tNome;
        this.descricao = tDescricao;
        this.prioridade = tPrioridade;
        this.status = tStatus;
        this.adicionarTarefa();
    }
    
    private void adicionarTarefa() {

        taskL.add(this);
        this.visualizartarefas();

    }
    
    public void visualizartarefas(){
        for(int i = 0; i < taskL.size(); i++){
            System.out.println(taskL.get(i).nome);
        }
    }
    
    
}
