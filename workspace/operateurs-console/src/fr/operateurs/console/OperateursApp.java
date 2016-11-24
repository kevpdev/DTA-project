package fr.operateurs.console;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("**** Application Opérations **** \n\n  Veuilez saisir le premier nombre : ");			
		//Saisie du premier nombre
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double nb1 = sc.nextDouble();		
		System.out.print(" Veuillez saisir le second nombre : ");
		//Saisie du deuxieme nombre
		double nb2 = sc.nextDouble();

		calcul(nb1, nb2);
		
		sc.close();
	}

	/**
	 * Methode permettant de calculer deux nombres entrées en paramètre
	 * @param nb1
	 * @param nb2
	 */
	public static void calcul(double nb1, double nb2 ){

		System.out.println(nb1+ " + "+nb2+" = "+ (nb1+nb2));
		System.out.println(nb1+ " - "+nb2+" = "+ (nb1-nb2));
		System.out.println(nb1+ " * "+nb2+" = "+ (nb1*nb2));
		System.out.println(nb1+ " / "+nb2+" = "+ (nb1/nb2));
		System.out.println(nb1+ " % "+nb2+" = "+ (nb1%nb2));
		System.out.println("\n Test soustraction bigdecimal");
		System.out.println(new BigDecimal(nb1).subtract(new BigDecimal(nb2)));
		System.out.println(new BigDecimal("1.0").subtract(new BigDecimal("0.9")));
	}


}
