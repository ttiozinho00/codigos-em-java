package com.algaworks.pagamento;

public interface operadora
{
	boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}