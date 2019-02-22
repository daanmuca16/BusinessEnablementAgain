package br.com.fiap.bo;


import org.apache.axis2.AxisFault;

import br.com.fiap.bean.Produto;

public class EstoqueBO {

	
	public static Produto consultarProduto(int cod)throws AxisFault{
		
		if (cod == 401) {
			return new Produto(cod, "Camiseta Branca", 2.99,4);
		} else if (cod == 402) {
			return new Produto (cod, "Camiseta Azul", 2.99,4);
		} else if (cod == 403) {
			return new Produto(cod, "Camiseta Rosa", 3.99, 5);
		} else {
		throw new AxisFault("Produto não encontrado");
		}
		

		
		
	}

}
