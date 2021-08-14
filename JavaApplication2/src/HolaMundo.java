
public class HolaMundo {
	
	// funci�n main(funcion principal)
	// public: Es el modificador de acceso al m�todo. Pueden ser public(cualquier clase puede acceder al m�todo), private (solo se puede usar
	//// dentro de la misma clase)
	//// proyected (solo quienes se hereden de dicha clase pueden acceder al m�todo)
	// Static: indica que no es necesario crear una instancia de la clase para acceder al m�todo
	// Void: indica el tipo de objeto que regresa la funcion. Void no regresa ning�n valor. Si una funcion regresara un texto ser�a
	//// string, si regresara un numero seria int, etc
	// main(String[] args): nombre del m�todo principal para ejecutar en consola con el JVM. Entre los parentesis est� el parametro que recibe,
	//// el cual en este caso es un arreglo, que contiene Strings: este array esta dentro del m�todo que se le identificar� con el name args
	public static void main(String args[]) {
		System.out.println("Hola mundo");
	}
	
	// Los metodos normalmente realizan solo una tarea. Cada m�todo tiene un nombre y este se usa para llamar a ese m�todo.
	// Los metodos de una clase suelen manipular y proporcionar acceso a los datos de la clase.
	// El metodo seria lo que esta dentro de la clase, ejemplo:
	
	/*
		// Un programa que usa la clase Vehiculo
	 	//El archivo se llama DemoVehiculo.java
		 
		class Vehiculo {
			int pasajeros;  //n�meros de pasajeros
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
