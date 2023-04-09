package ar.edu.unju.edm.ejercicio1.model;

public class AnioBisiesto {
	public void esBisiesto (int anio) {
		boolean bisiesto = (anio%4==0 && anio%100!=0 || anio%400==0);
		if(bisiesto) {
			System.out.println(anio+" SI es un año bisiesto");
		}else {
			System.out.println(anio+" NO es un año bisiesto");
		}
	}
}
