package encapsulacion;

public class Automovil {
	
	// Atributos
	private int precio;
	private String marca; // privados
	
	// Constructor
	public Automovil() {
		System.out.println("Se creo el objeto Automovil");
	}
	
	// Para acceder a atributos PRIVADOS:
	// GET y SET
	// Get: Método que devuelve el valor de una variable/atributo
	// Set: Método que asgina un valor a una variable/atributo
	
	// Métodos get
	public int getPrecio() { // Le paso int xq devuelve un entero (el precio)
		return this.precio; // Con this acceso a los datos que estan en este Automovil.java
	}
	
	public String getMarca() { // Sintrg ya que devuelve la marca que es un string
		return this.marca;
	}
	
	// Métodos set
	public void setPrecio(int p) { // void ya que no retornará nada, solo cambiará algo // Recibe un entero precio
		this.precio = p;
	}
	
	public void setMarca(String m) { // recibe un string marca
		this.marca = m;
	}

}
