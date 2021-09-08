package encapsulacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Llamar constructor
		Automovil auto = new Automovil();
		// auto.getPrecio(); // No podría acceder a auto.precio o auto.marca pero si a los métodos que me lo devuelven o modifican.
		
		// Asignar valor:
		auto.setMarca("Renault Sandero"); // Con set cambiamos el precio o le asignamos un precio
		System.out.println("La marca del auto indicado es: " + auto.getMarca()); // Con get lo obtenemos
		// En este caso utilizo SET primero para asignarle algo ya que el string es nulo y el int es 0, pero podría asignarle valores en el Automovil
		// y entonces no utilizar el set.
		
		auto.setPrecio(20800);
		System.out.println("El precio del auto indicado es: " + auto.getPrecio());
		
	}

}
