package views;

import java.util.List;

import controllers.FormaController;
import models.Circulo;
import models.Forma;

public class ListarCirculo {

	public static void renderizar() {
		List<Forma> formas = FormaController.listar();
		System.out.println("Listando círculos\n");
		for(int i = 0; i < formas.size(); i++) {
			Forma forma = formas.get(i);
			if(forma instanceof Circulo) {
				System.out.println(forma);
			}
		}
	}

}
