/*
   7. Crear un algoritmo que genere al azar 15 números de la ruleta (del 0 al 36) y muestre el % de números pares, % de impares 
   y % de ceros generados.
*/

import java.util.*;

public class Ejercicio7 {

	public static void main(String args[]) {

		final int CANTIDAD = 15;
		int numAl;
		double contCero=0, contImpar=0, contPar=0, porcCero, porcImpar, porcPar;

		Random random = new Random();

		System.out.println();

		for (int i=1; i<=CANTIDAD; i++) {

			numAl = random.nextInt(36+1);

			System.out.println("- "+numAl+" -");

			if (numAl%2==0) {
				if (numAl==0) {
					contCero++;
				} else {
					contPar++;
				}
			} else {
				contImpar++;
			}
		}

		porcCero = 100*contCero/CANTIDAD;
		porcPar = 100*contPar/CANTIDAD;
		porcImpar = 100*contImpar/CANTIDAD;

		System.out.println("\n   Porcentaje de ceros: "+porcCero+"%");
		System.out.println(  "   Porcentaje de pares: "+porcPar+"%");
		System.out.println(  "   Porcentaje de impares: "+porcImpar+"%\n");

	}


}

