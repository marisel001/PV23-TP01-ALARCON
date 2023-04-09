package ar.edu.unju.edm.ejercicio3.model;

public class NumerosPrimos {
	public boolean esPrimo (int n) {
		boolean primo=true;
		for(int i=2; i<n && primo==true;i++) {
			if(n%i==0) {
				primo=false;
			}
		}
		return primo;
	}
	
	public void mostrarPrimos(int n) {
		if(n<1) {
			System.out.println("Un número primo es un número natural mayor que 1");
		}else if(n==1) {
			System.out.println("El número 1 no es primo");
		}else {
			System.out.println("Listado de números primos MENORES a "+n);
				for(int x=2; x<n; x++) {
					if(esPrimo(x)) {
						System.out.println(x);
					}
				}
		}
		
	}
}
