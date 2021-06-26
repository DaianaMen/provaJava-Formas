package views;

import controllers.FormaController;

public class ListarTodos {
	
	public static void rendenizar() {
		System.out.println("Todas as Formas");
		FormaController.listar();
	}

}