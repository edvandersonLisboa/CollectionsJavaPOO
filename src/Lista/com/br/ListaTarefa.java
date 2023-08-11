package Lista.com.br;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public List<Tarefa> getTarefalist() {
        return this.tarefalist;
    }
    public void adicionarTarefa(String descricao){
        this.tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa item : this.tarefalist){
            if(item.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(item);
            }
        }
        tarefalist.removeAll(tarefaParaRemover);
    }
    public int obterNumeroTotalTarefa(){
        return tarefalist.size();
    }
    public List<String> obterDescricaoesTarefas(){
        List<String> descricoes = new ArrayList<>();
        for(Tarefa item : this.tarefalist){
            descricoes.add(item.getDescricao());
        }
        return descricoes;

    }
    public List<Tarefa> obterlistaTarefas(){

        return this.tarefalist;

    }
   //testando os metodos
    public static  void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("andar de barco em setembro");
        listaTarefa.adicionarTarefa("passar na Serpro");
        listaTarefa.adicionarTarefa("curar o olho cego");
        listaTarefa.adicionarTarefa("andar de barco em setembro");

        System.out.println("");
        System.out.println("tarefas: "+listaTarefa.obterlistaTarefas());
        listaTarefa.removerTarefa("andar de barco em setembro");


        System.out.println("");
        for(String desc : listaTarefa.obterDescricaoesTarefas()){
            System.out.println("descrições: "+desc);
        }

        System.out.println("");

        System.out.println("o numero total de tarefa é: "+listaTarefa.obterNumeroTotalTarefa());

    }
}
