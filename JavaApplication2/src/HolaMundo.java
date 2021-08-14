
public class HolaMundo {
	
	// función main(funcion principal)
	// public: Es el modificador de acceso al método. Pueden ser public(cualquier clase puede acceder al método), private (solo se puede usar
	//// dentro de la misma clase)
	//// proyected (solo quienes se hereden de dicha clase pueden acceder al método)
	// Static: indica que no es necesario crear una instancia de la clase para acceder al método
	// Void: indica el tipo de objeto que regresa la funcion. Void no regresa ningún valor. Si una funcion regresara un texto sería
	//// string, si regresara un numero seria int, etc
	// main(String[] args): nombre del método principal para ejecutar en consola con el JVM. Entre los parentesis está el parametro que recibe,
	//// el cual en este caso es un arreglo, que contiene Strings: este array esta dentro del método que se le identificará con el name args
	public static void main(String args[]) {
		System.out.println("Hola mundo");
	}
	
	// Los metodos normalmente realizan solo una tarea. Cada método tiene un nombre y este se usa para llamar a ese método.
	// Los metodos de una clase suelen manipular y proporcionar acceso a los datos de la clase.
	// El metodo seria lo que esta dentro de la clase, ejemplo:
	
	/*
		// Un programa que usa la clase Vehiculo
	 	//El archivo se llama DemoVehiculo.java
		 
		class Vehiculo {
			int pasajeros;  //números de pasajeros
			int capacidad;  //capacidad del combustible en galones 
			int mpg;        //combustible consumido en millas por galon
		}
		//Esta clase declara un objeto de tipo Vehiculo
		class DemoVehiculo {
		    public static void main(String[] args) {
		        Vehiculo minivan = new Vehiculo();
		        int rango;
		        //asignando valores a los campos de minivan
		        minivan.pasajeros = 9;
		        minivan.capacidad = 15;
		        minivan.mpg = 20;
		        //Calcular el rango asumiendo un tanque lleno
		        rango = minivan.capacidad * minivan.mpg;
		        System.out.println("La Minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " millas");
		    }
		}
		*/

}
