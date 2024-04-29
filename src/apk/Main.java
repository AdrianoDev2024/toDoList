package apk;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Tarefas tarefas = new Tarefas();
		
		tarefas.titulo = "Criar portifolio";
		tarefas.dataCriacao = LocalDate.now();
		tarefas.status = "Não";
		
		System.out.println("Titulo da tarefa: " + tarefas.titulo);
		System.out.println("Data de criação: " + tarefas.dataCriacao);
		System.out.println("Estatus da lista: " + tarefas.status);
		
		System.out.println("==========================================");
		
		System.out.println(tarefas.toString());

	}

}
