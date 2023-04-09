package ar.edu.unju.edm.ejercicio5.model;
import java.util.Date;

public class Empleado {

	//declaración de atributos
	private String nombre;
	private Date fechaIngreso;
	private Integer legajo;
	private String correo;
	private Float sueldo;
	private Float horasTrabajadas;
	
	//Declaración de constructor por defecto
	public Empleado() {
		//supuestamente la maquina le da valores, null para objetos y 0 para enteros
	}
	
	//Declaraación de constructor parametrizado
	public Empleado(String nombre,Integer legajo,Float horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	//Método específico
	public Float calcularSueldo(Float horas) {
		if(horas<=0) {
			return (float)0.0;
		}else if(horas<161) {
				return (horas*4000);
			}else {
				return (horas*5500);
			}
	}
	
	/*
	public void mostrar(Empleado unEmpleado) {
		System.out.println("Nombre: "+unEmpleado.getNombre());
		System.out.println("Legajo: "+unEmpleado.getLegajo());
		System.out.println("Horas trabajadas: "+unEmpleado.getHorasTrabajadas());
	}
	*/
	public void mostrar() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Legajo: "+getLegajo());
		System.out.println("Horas trabajadas: "+getHorasTrabajadas());
		System.out.println("Sueldo: "+getSueldo());
		System.out.println("Fecha de ingreso: "+getFechaIngreso());
		System.out.println("Correo: "+getCorreo());
		
	}
	
	//getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Float getSueldo() {
		setSueldo();
		return sueldo;
	}

	public void setSueldo() {
		//this.sueldo = sueldo;
		this.sueldo =  calcularSueldo(getHorasTrabajadas());
	}

	public Float getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Float horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	
	
}
