package apk;

import java.time.LocalDate;

public class Tarefas {
	
	public String titulo;
	public LocalDate dataCriacao;
	public String status;
	
	public Tarefas() {
		
	}
	
	public Tarefas(String titulo, LocalDate dataCriacao, String status) {
		super();
		this.titulo = titulo;
		this.dataCriacao = dataCriacao;
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Tarefas [titulo=" + titulo + ", dataCriacao=" + dataCriacao + ", status=" + status + "]";
	}
	
	

}
