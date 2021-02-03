package tarea4;

public class Ejerc5App {

	public static void main(String[] args) {
		
		//Variables
		int a = 1, b = 5, c = 20, d = 100;
		
		//Salida por pantalla de los valores originales
		System.out.println("Valores originales de las variables:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		//Intercambio de valores y salida por pantalla
		System.out.println("Vamos intercambiando los valores...");
		b = c;
		System.out.println("b toma el valor de c: b = " + b);
		c = a;
		System.out.println("c toma el valor de a: c = " + c);
		a = d;
		System.out.println("a toma el valor de d: a = " + a);
		d = b;
		System.out.println("d toma el valor de b: d = " + d);
	
	}

}
