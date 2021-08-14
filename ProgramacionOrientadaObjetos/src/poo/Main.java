package poo;

public class Main {

	public static void main(String[] args) {
		// Como ya tengo definida mi clase tipo Persona voy a crear un objeto de este tipo de clase
		Persona hombre = new Persona(); //Nuevo objeto del tipo de clase persona. Estoy llamando al constructor con new Persona
		Persona mujer = new Persona();
		
		hombre.nombre = "Rodrigo ";
		hombre.apellido = "Torres";
		
		System.out.println("Objeto hombre: " + hombre.nombre + hombre.apellido);
		
	}
	
	// Objeto: Abstracción de la realidad. Tomo algo de la realidad y la traigo a java para que sea mi objeto
	
	// Clase: Abstracción de ese objeto en un lenguaje de progamacion

}
