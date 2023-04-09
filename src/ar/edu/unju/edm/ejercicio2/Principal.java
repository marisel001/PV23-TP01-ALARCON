package ar.edu.unju.edm.ejercicio2;
import java.util.Scanner;

import ar.edu.unju.edm.ejercicio2.model.Meses;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int mes;
		System.out.print("Ingrese un número entero: ");
		mes = entrada.nextInt();
		entrada.close();
		
		Meses posibleMes = new Meses();
		posibleMes.determinarMes(mes);

	}

}
