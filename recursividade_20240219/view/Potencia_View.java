package recursividade_20240219.view;

import recursividade_20240219.controller.Potencia_Controller;

public class Potencia_View {
	public static void main(String[] args) {
		int base = 3;
		int expoente = 4;
		Potencia_Controller pCont = new Potencia_Controller();
		int potencia = pCont.potencia(base, expoente);
		System.out.println(potencia);
	}
}