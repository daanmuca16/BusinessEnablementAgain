package br.com.fiap.bean;

import java.io.Serializable;

public class Produto implements Comparable<Produto>,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String descricao;
	private double preco;
	private int quantidade;
	
	
	
	
	public Produto(int codigo, String descricao, double preco, int quantidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(){
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int compareTo(Produto p) {
	
		return this.descricao.compareTo(p.getDescricao());
	}
	
	
	

}
