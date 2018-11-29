package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cronometro crono = new Cronometro();
		
		System.out.println("Pulsa intro para iniciar cronómetro");
		sc.nextLine();
		crono.start();
		System.out.println("Pulsa intro para parar el tiempo y mostrarlo");
		sc.nextLine();
		System.out.println("Tiempo " + crono.stop() + " Segundos");
		sc.close();
		
	}

}
