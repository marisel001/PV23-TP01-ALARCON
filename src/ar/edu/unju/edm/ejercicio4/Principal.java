package ar.edu.unju.edm.ejercicio4;
import java.util.Scanner;
import ar.edu.unju.edm.ejercicio4.model.ParesImpares;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int limInf, limSup;
		String criterio;
		
		//Guardar los limites y el criterio
		System.out.print("Digite limite inferior: ");
		limInf = entrada.nextInt();
		System.out.print("Digite limite superior: ");
		limSup = entrada.nextInt();
		System.out.print("Determinar los números PAR o IMPAR?: ");
		criterio = entrada.next();
		entrada.close();
		
		ParesImpares nuevoRango = new ParesImpares();
		nuevoRango.mostrar(limInf, limSup, criterio);
	}

}
