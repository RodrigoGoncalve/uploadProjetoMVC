package br.com.rlsystem.tasks.model;

import java.util.Date;

public class Tasks {
	
	private int id;
	private String nome;
	private Date data;
	private boolean status;
	
	public Tasks(int id, String nome, Date data, boolean status) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.status = status;
	}
	public int getId() {
		return  id;
	}
	public void setId(int id) {
		this.id = id;	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
