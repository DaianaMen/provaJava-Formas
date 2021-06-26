package views;

import controllers.FormaController;
import models.Retangulo;
import utils.Console;


public class CadastrarRetangulo {

	private static Retangulo retangulo;
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));
		retangulo = new Retangulo();
		System.out.println("\n-- Cadastrar Retângulo --\n");
		
		retangulo.setAltura(Console.lerInteiro("\nDigite a Altura:"));
		retangulo.setLargura(Console.lerInteiro("\nDigite a Largura:"));
		FormaController.cadastrar(retangulo);
	}

}