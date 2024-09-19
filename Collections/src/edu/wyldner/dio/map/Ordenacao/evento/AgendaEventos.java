package edu.wyldner.dio.map.Ordenacao.evento;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;// datas = LocalDate, LocalDateTime, instant, period, date, zoneTime(local zone) tem várias

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();// pra ordenar vai ser o treemap
  }

  
  
  
//=======================================================================
  public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
    eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
  }

  
  
  
  
//=======================================================================
  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);//para ordem, localDate já tem comparable então já sabe organizar
    
    
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      Evento evento = entry.getValue();
      System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
    }
  }

  
  
  
  
//=======================================================================
  public void obterProximoEvento() {
	  
	  /* 
	  Set<LocalDate> dataSet = eventosMap.keySet();// met q retorna todas as keys
	  Collection<Evento> values = eventosMap.values();// met q retorna todos os valores
	  só q ficam independentes
	  */
	  
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    
    
    for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {// entryset tem elementos únicos sabe apontar sem idependencia
      LocalDate dataEvento = entry.getKey();
      
      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {//after só é possível pq entryset já os organiza
        proximaData = dataEvento;
        proximoEvento = entry.getValue();
        break;
      }
    }
    
    
    if (proximoEvento != null) {
      System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
    } else {
      System.out.println("Não há eventos futuros na agenda.");
    }
  }

  
  
  
  
  
  
  
//=======================================================================
  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos à agenda - observe os tipo de passagem para LocalDate
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    // Exibe a agenda completa de eventos
    agendaEventos.exibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    agendaEventos.obterProximoEvento();
  }
}