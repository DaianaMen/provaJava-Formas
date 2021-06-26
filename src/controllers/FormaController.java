package controllers;

import java.util.ArrayList;
import models.Forma;

import controllers.FormaController;

public class FormaController {

	private static ArrayList<Forma> formas = new ArrayList<Forma>();

	public static void cadastrar(Forma forma) {
		formas.add(forma);
	}

	public static ArrayList<Forma> listar() {
		for (Forma forma : formas) {
			System.out.println(forma);
		}
		return formas;
	}

}