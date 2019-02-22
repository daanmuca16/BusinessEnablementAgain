package br.com.fiap.lojaTerminalConsulta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class TerminalConsulta {
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Renner");
		System.out.println(hoje.format(formatador));

		int cd = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto desejado"));
		

		if (cd == 401) {
			System.out.println("Camiseta Branca");
		} else if (cd == 402) {
			System.out.println("Camiseta Azul");
		} else if (cd == 403) {
			System.out.println("Camiseta Rosa");
		} else {
			System.out.println("Produto não Encontrado");
		}
	}

}
