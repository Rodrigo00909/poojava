package funciones;

public class Persona {

	String nombre = "";
	int edad = 0;
	
	public Persona(String nom, int edad) {
		// Por mas que ya le haya asignado el nombre al constructor en el main, debo asignarle este valor a la variable nombre de este fichero:
		this.nombre = nom; // Le asigno a la variable nombre, lo que recibo como parametro
		this.edad = edad;
		System.out.println("Se creó un objeto de tipo persona");
		System.out.println("Hola soy " + nom + "!!. Tengo " + edad + " años");
	}
	
}
