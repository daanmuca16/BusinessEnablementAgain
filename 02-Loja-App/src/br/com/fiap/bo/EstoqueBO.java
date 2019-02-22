package br.com.fiap.bo;


import java.io.FileInputStream;
import java.util.Properties;

import br.com.fiap.bean.Produto;

public class EstoqueBO {

	
	public static Produto consultarProduto(int cod)throws Exception{
		
		if (cod == 401) {
			return new Produto(cod, "Camiseta Branca", 2.99,4);
		} else if (cod == 402) {
			return new Produto (cod, "Camiseta Azul", 2.99,4);
		} else if (cod == 403) {
			return new Produto(cod, "Camiseta Rosa", 3.99, 5);
		} else {
			return new Produto (-1, "Produto não encontrado",0,0);
		}
		

		
		
	}

}
