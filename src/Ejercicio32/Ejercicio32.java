package Ejercicio32;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array1 = { 1, 2, 3 };
		
		int resultado[] = copiararray(array1);

		for (int i = 0; i < resultado.length; i++) {
			System.out.print(resultado[i]+ " ");
		}

	}

	public static int[] copiararray(int[] array1) {

		int arraynuevo[] = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			arraynuevo[i] = array1[i];
		}
		
		return arraynuevo;
	}
		
		
	}

