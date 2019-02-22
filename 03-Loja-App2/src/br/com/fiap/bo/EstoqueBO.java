package br.com.fiap.bo;


import org.apache.log4j.Logger;

import br.com.fiap.bean.Produto;

public class EstoqueBO {

	private static Logger log = Logger.getLogger(EstoqueBO.class);
	public static Produto consultarProduto(int cod)throws Exception{
		log.warn("inciou");
		
		if (cod == 401) {
			log.debug("condição camsieta branca ok");
			return new Produto(cod, "Camiseta Branca", 2.99,4);
		} 
		else if (cod == 402) {
			log.debug("condição camiseta azul ok");
			return new Produto (cod, "Camiseta Azul", 2.99,4);
		} else if (cod == 403) {
			log.debug("condicao camiseta rosa ok");
			return new Produto(cod, "Camiseta Rosa", 3.99, 5);
		} else {
			log.warn("codigo invalido");
			return new Produto (-1, "Produto não encontrado",0,0);
		}
		
			
		
	}

}
