package edu.wyldner.dio.list.OperacoesBasicas.Terefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  //atributo - uma lista de tarefa
  private List<Tarefa> tarefaList;
  
//======================================== 
  // construtor - sempre q chamar gera lista nova.
  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();// arraylist vazio
  } 

  
  
//========================================
  // adiciono uma tarefa a lista
  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));//posso passar o índice tbm (int posição, Terefa elemento)
    // posso passar uma coleção tbm. põe .add e vê os addall etc
  }

  
  
//======================================== 
  // removendo tarefa
  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    
    if (!tarefaList.isEmpty()) {// tá cheia
    	// foreach pra cada elemento
      for (Tarefa t : tarefaList) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {//comparo descrição dos itens com a q quero
          tarefasParaRemover.add(t);//adiciono a minha nova lista
        }
      }
      tarefaList.removeAll(tarefasParaRemover);// passo os elementos da lista para remover para minha primeira lista e removo
      // assim como o add o remove tem vário tbm. olhar
      
      
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  
  
  
//========================================
  // número de tarefas na lista
  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  
  
  
//========================================
  // se estiver cheia imprime a lista
  public void obterDescricoesTarefas() {
    if (!tarefaList.isEmpty()) {
      System.out.println(tarefaList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  
 //======================================== principal 
  public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefa
    ListaTarefa listaTarefa = new ListaTarefa();

    
    // Adicionando tarefas à lista
    listaTarefa.adicionarTarefa("Comprar leite");
    listaTarefa.adicionarTarefa("Estudar para o exame");
    listaTarefa.adicionarTarefa("Fazer exercícios");

    
    // Exibindo o número total de tarefas na lista
    System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    // Exibindo as descrições das tarefas na lista
    listaTarefa.obterDescricoesTarefas();

    
    // Removendo uma tarefa da lista
    listaTarefa.removerTarefa("Trabalhar");

    
    // Exibindo o número total de tarefas na lista após a remoção
    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    
    // Exibindo as descrições das tarefas atualizadas na lista
    listaTarefa.obterDescricoesTarefas();

    
    // Removendo uma tarefa da lista quando a lista está vazia
    listaTarefa.removerTarefa("Estudar para o exame");

    
    // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
  }
}
