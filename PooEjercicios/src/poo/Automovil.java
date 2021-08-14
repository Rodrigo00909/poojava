package poo;

public class Automovil {
	// Atributos o Caracteriscicas
	
	String marca;
	String color;
	int modelo;
	int precio;
	boolean estado = false;
	
	// Constructor: construye una instancia del objeto. Solo se inicia con public y el nombre 
	public Automovil() {
		// System.out.println("Se creo un objeto de tipo Automovil");
	}
	
	// Métodos o Funciones:
	public void encender() {
		if(estado) {
			System.out.println("El vehiculo ya está encendido!!!");
		} else {
			System.out.println("El vehiculo se ha encendido");
			estado = true;
		}
	}
	
	public void apagar() {
		if(estado) {
			System.out.println("El vehiculo se ha apagado");
			estado = false;
		} else {
			System.out.println("El vehiculo ya está apagado!!!");
		}
	}
	
	public void avanzar() {
		if(estado) {
			System.out.println("Avanzando...");
		} else {
			System.out.println("Para avanzar primero debe encender el auto.");
		}
	}
}
