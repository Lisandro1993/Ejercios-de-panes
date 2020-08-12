package prueba;

import java.util.Scanner;

public class pruebapp {

	public static void main(String[] args) {
		
		
		int cantpeiza = 0;  // declare la variable que almacenara la cantidad de pieza de pan que el cliente comprara
		double Totalpago = 0;  // variable que almacenara y devolvera el resultado de las operciones

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de piezas de pan  :");

		cantpeiza = scanner.nextInt();// lee el valor, que es la cantidad de pieza de pan que adquirido el cliente

		if (cantpeiza >= 50 && cantpeiza < 100) {

			Totalpago = cantpeiza * 4.50;
		}

		else if (cantpeiza >= 100) {
			Totalpago = cantpeiza * 4;
		}

		else {
			Totalpago = cantpeiza * 5;
		}

		System.out.println("El cliente compro " + cantpeiza + "Pieza de pan");
		System.out.println("El total a pagar es: " + Totalpago);

	}

}
