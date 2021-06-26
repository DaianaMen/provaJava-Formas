package views;

import controllers.FormaController;
import models.Circulo;
import utils.Console;

public class CadastrarCirculo {

	private static Circulo circulo;
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));
		circulo = new Circulo();
		System.out.println("\n-- Cadastrar Círculo --\n");
		
		circulo.setRaio(Console.lerInteiro("\nDigite o raio:"));
		FormaController.cadastrar(circulo);
	}

}
