package modacceso;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona alguien = new Persona();
		
		alguien.edad = 20;
		// alguien.nombre = "Sebastian"; // NO SE PUEDE XQ ES PRIVADO
		
		alguien.crecer(); 
		// No puedo acceder a vestirse() xq es privado
	}

}
