
public class ED_Debug {

	
	public static void funcion1() {
		
		int a=2;
		
		String string1 = "string1";

		String string2 = "string2";
		
		
		// Qué hacen estas dos líneas de código???
		//Crea una variable llamada string1 de tipo string con valor "string1" por defecto
		//Crea una variable llamada string2 de tipo string con valor "string2" por defecto


		string2= string2.substring(0, string2.length()-1);
		string2=string2+"1";
		
		// Esta función tiene errores
		// Por qué no va el ==   ???
		// Por que se hace con .equals
		
		// Qué tengo que hacer para solucionarlo ???
		// Con el doble igual se compara posiciones de memoria hay que poner -> if (string1.equals(string2)) y lo que sea
		
		if(string1 == string2 ) {
			System.out.println("SON IGUALES " + a);
		}
		else {
			System.out.println("SON DIFERENTES");
		}
		
		
		
	}
	
	
	public void funcion2() {
		
		System.out.println("--------------------");
		System.out.println("Esta es la función 2");
		System.out.println("Cómo hago la llamada para que funcione????");
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int i;
		for(i = 0; i<10; i++)
			a *= i;
		
		System.out.println("El valor de a es: "+a);
		
		
		funcion1();
		
		//Esta función no me va ... ¿ por que ?
		// Falta ponerlo como un static
		// Tengo dos soluciones .. ¿como?
		// funcion2();
	}

}
