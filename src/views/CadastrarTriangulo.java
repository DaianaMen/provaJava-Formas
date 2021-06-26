package views;

// lerInteiro console.java *******
import controllers.FormaController;
import models.Triangulo;
import utils.Console;

public class CadastrarTriangulo {
	
	private static Triangulo triangulo;
	
	public static void renderizar() {
		System.out.println("\n".repeat(15));
		triangulo = new Triangulo();
		System.out.println("\n-- Cadastrar Tri�ngulo --\n");
		
		triangulo.setAltura(Console.lerInteiro("\nDigite a Altura:"));
		triangulo.setBase(Console.lerInteiro("\nDigite a Base:"));
		
		FormaController.cadastrar(triangulo);
		
	}

}