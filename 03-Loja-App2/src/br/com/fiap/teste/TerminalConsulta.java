package br.com.fiap.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.bean.Produto;
import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.singleton.PropertySingleton;

public class TerminalConsulta {

	private static Logger log = Logger.getLogger(TerminalConsulta.class);
	public static void main(String[] args) throws Exception {
		log.warn("incializada");
		Scanner scanner = new Scanner(System.in);
		String nome = PropertySingleton.getInstance().getProperty("nome");
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter
				.ofPattern(PropertySingleton.getInstance().getProperty("mascara"));
		System.out.println(nome + " " + hoje.format(formatador));
		System.out.println("Digite o codigo: ");
		int codigo = scanner.nextInt();
		Produto p = EstoqueBO.consultarProduto(codigo);
		
		System.out.println(p.getDescricao());
		log.warn("Final da aplicaçao");
	}

}
