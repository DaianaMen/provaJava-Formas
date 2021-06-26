package views;

import java.util.List;

import controllers.FormaController;
import models.Forma;
import models.Triangulo;

public class ListarTriangulo {

	public static void renderizar() {
		List<Forma> formas = FormaController.listar();
		System.out.println("Listando triângulos\n");
		for(int i = 0; i < formas.size(); i++) {
			Forma forma = formas.get(i);
			if(forma instanceof Triangulo) {
				System.out.println(forma);
			}
		}
	}

}
