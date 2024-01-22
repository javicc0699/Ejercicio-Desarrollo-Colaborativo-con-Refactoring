package EjerciciosParaRefactorizar;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Introduce un n�mero mayor al anterior: ");
		int n2 = sc.nextInt();
		
		if (n2 < n1) {
			System.out.println("Error. Introduce un n�mero mayor al anterior: ");
			n2 = sc.nextInt();
		}
		
		System.out.println("Los n�meros comprendidos entre " + n1 + "y" + n2 + " son " + listadoNumeros(n1, n2));
		
		sc.close();
	}
	
	public static String listadoNumeros(int n1, int n2) {
		
		String listadoDeNumeros = "";
		
		for (int indice = n1; indice <= n2; indice++) {
			
			listadoDeNumeros = listadoDeNumeros + " " + indice;
		}
		
		return listadoDeNumeros;
	}
}


