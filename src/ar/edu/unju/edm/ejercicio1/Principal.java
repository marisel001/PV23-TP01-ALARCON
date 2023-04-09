package ar.edu.unju.edm.ejercicio1;

import ar.edu.unju.edm.ejercicio1.model.AnioBisiesto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anio = 1988;
		if(anio<0) {
			System.out.println("No se consideran los años negativos");
		}else {
			AnioBisiesto unAnio = new AnioBisiesto();
			unAnio.esBisiesto(anio);
		}
	}

}
