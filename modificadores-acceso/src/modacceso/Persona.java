package modacceso;

public class Persona {
	
	// Constructor
	public Persona() {
		System.out.println("Se cre� un objeto de tipo persona");
	}
	
	// Atributos
	private String nombre = ""; // Este atributo es PRIVADO. No puedo acceder a �l desde el Main o cualquier otra funcion
	int edad = 0; // Este atributo es publico.
	
	// M�todos
	public void crecer() {
		
	}
	
	private void vestirse() { // cuando una persona se viste deberia ser privado entonce slo dejamos asi (?
		
	}

}
