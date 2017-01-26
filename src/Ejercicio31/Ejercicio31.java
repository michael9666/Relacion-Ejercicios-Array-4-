package Ejercicio31;

public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6, 7, 8 };

		int resultado[] = concatenar(array1, array2);

		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}

	}

	public static int[] concatenar(int[] array1, int[] array2) {

		int arraynuevo[] = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			arraynuevo[i] = array1[i];
		}

		for (int j = 0; j < array2.length; j++) {
			arraynuevo[array1.length + j] = array2[j];
		}

		return arraynuevo;
	}

}
