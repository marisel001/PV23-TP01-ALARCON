package ar.edu.unju.edm.ejercicio5;
import java.util.Date;

import ar.edu.unju.edm.ejercicio5.model.Empleado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado primerEmpleado = new Empleado();
		
		primerEmpleado.setNombre("Sergio Calatayud");
		primerEmpleado.setFechaIngreso(new Date(123,3,13));
		primerEmpleado.setLegajo(1);
		primerEmpleado.setCorreo("mariselwm12@gmail.com");
		primerEmpleado.setHorasTrabajadas((float)160);
		
		System.out.println("PRIMER EMPLEADO:");
		primerEmpleado.mostrar();
		
		
		Empleado segundoEmpleado = new Empleado("Carolina Paniagua",2,(float)161);
		System.out.println("\nSEGUNDO EMPLEADO:");
		segundoEmpleado.mostrar();
	}

}
