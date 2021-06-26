package views;

import java.util.List;

import controllers.FormaController;
import models.Forma;
import models.Retangulo;

public class ListarRetangulo {

	public static void renderizar() {
		List<Forma> formas = FormaController.listar();
		System.out.println("Listando retângulos\n");
		for(int i = 0; i < formas.size(); i++) {
			Forma forma = formas.get(i);
			if(forma instanceof Retangulo) {
				System.out.println(forma);
			}
		}
	}

}