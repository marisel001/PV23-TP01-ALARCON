package ar.edu.unju.edm.ejercicio4.model;

public class ParesImpares {
	public boolean esPar(int x) {
		return x%2==0;
	}
	
	public void mostrar(int linf, int lsup, String criterio) {
		if(linf<lsup) {
				if("PAR".equals(criterio)) {
					for(int x=linf;x<=lsup;x++) {
						if(esPar(x)) {
							System.out.println(x);
						}
					}
				}else if("IMPAR".equals(criterio)) {
						for(int j=linf; j<=lsup; j++) {
							if(esPar(j)==false) {
								System.out.println(j);
							}
						}
					}else {
						System.out.println("\nEse criterio no está definido. Recuerde escribirlo en mayúscula.");
					}
		}else {
			System.out.println("\nEl limite inferior debe ser menor que el limite superior.");
		}
	}
}
