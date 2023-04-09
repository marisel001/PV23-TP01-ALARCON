package ar.edu.unju.edm.ejercicio3;
import java.util.Scanner;

import ar.edu.unju.edm.ejercicio3.model.NumerosPrimos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un número: ");
		num = entrada.nextInt();
		entrada.close();
		
		NumerosPrimos unNumero = new NumerosPrimos();
		unNumero.mostrarPrimos(num);
	}

}
