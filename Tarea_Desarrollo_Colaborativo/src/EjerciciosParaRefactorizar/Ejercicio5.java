package EjerciciosParaRefactorizar;

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dime un caracter(pulse z para salir): ");
	char caracter = sc.next().charAt(0);
	
	contador(caracter);
	
	

}

public static void contador(char caracter) {
	
	Scanner sc = new Scanner(System.in);
	
	final char pararBucle = 'z';
	
	int contadorDeVocales = 0;
	while (caracter != pararBucle) {
		
		if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u'))
			contadorDeVocales++;
		
		System.out.println("Dime otro car�cter(pulse z para salir): ");
		caracter = sc.next().charAt(0);
	}
	System.out.println("Se han contado " + contadorDeVocales + " vocales.");
	sc.close();
}
}