package com.algaworks.caixa;

public class Compra
{
	private String nomeCliente;
	private double valorTotal;
	private String produto;

	public String getNomeCliente() 
	{
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) 
	{
		this.nomeCliente = nomeCliente;
	}

	public double getValorTotal() 
	{
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) 
	{
		this.valorTotal = valorTotal;
	}

	public String getProduto() 
	{
		return produto;
	}

	public void setProduto(String produto) 
	{
		this.produto = produto;
	}
}