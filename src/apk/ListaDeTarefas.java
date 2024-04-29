package apk;

import java.util.ArrayList;
import java.util.List;

public abstract class ListaDeTarefas {
	
	private List<Tarefas> tarefas;
	
	public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }
	
	public abstract void adicionar(Tarefas tarefas); {
		tarefas.addAll(tarefas);
	}
	//public remover; 
	//public editar; 
	//public marcarComoConcluída;

}
