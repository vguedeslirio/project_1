 	package br.com.myjsf.Controle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class VeiculoControle {
	private String id;
	private Integer tipo;
	private String modelo;
	private String preco;
	private String cor;
	
	public VeiculoControle() { }
	
	public String exibirDados() {
		FacesMessage message;
		
		String saida = "Valores Preenchidos com sucesso!";
		message = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
		saida = "Tipo "+ tipo;
		message = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
		saida = "Modelo "+ modelo;
		message = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
		saida = "Cor "+ cor;
		message = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
		saida = "Preço " + preco;
		message = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
		return "resultado1";
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
