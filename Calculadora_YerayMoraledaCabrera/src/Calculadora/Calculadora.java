package Calculadora;

import java.util.Scanner;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);

	public static void Menu() {

		String opcion = "";

        do {
            System.out.println("\n CALCULADORA \n"
                    + "(PULSA 1) Sumar. \n"
                    + "(PULSA 2) Restar. \n"
                    + "(PULSA 3) Mutiplicar. \n"
                    + "(PULSA 4) Dividir. \n"
                    + "(PULSA 5) Raiz Cuadrada. \n"
                    + "(PULSA 0) Salir. \n");
            
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    Sumar();
                    break;
                case "2":
                    Restar();
                    break;
                case "3":
                    Multiplicar();
                    break;
                case "4":
                    Dividir();
                    break;
                case "5":
                	RaizCuadrada();
                	break;
                case "0":
                	System.out.println("Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, Intentalo de nuevo.");
            }

        } while (true);
        
	}

	static Double n1;
	static Double n2;

	public static void IntroducirNumeros() {
		try {
			System.out.print("\nIntroduce un numero: ");
			n1 = sc.nextDouble();
			System.out.print("\nIntroduce otro numero:");
			n2 = sc.nextDouble();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void Resultado() {
		System.out.println("El resultado es: ");
	}
	public static String DoubletoString(Double valor) {
		String nuevo_valor = String.valueOf(valor);
		if (nuevo_valor.endsWith(".0")) {
			nuevo_valor = nuevo_valor.replaceAll(".0", "");
		}
		return nuevo_valor;
	}

	public static void Sumar() {
		IntroducirNumeros();
		Double suma = n1 + n2;
		System.out.println("Suma: " + DoubletoString(suma));
	}
	public static void Restar() {
		IntroducirNumeros();
		Double resta = n1 - n2;
		System.out.println("Resta: " + DoubletoString(resta));
	}
	public static void Multiplicar() {
		IntroducirNumeros();
		Double multi = n1 * n2;
		System.out.println("Multiplicacion: " + DoubletoString(multi));
	}
	public static void Dividir() {
		IntroducirNumeros();
		Double divi = n1 / n2;
		System.out.println("Division: " + DoubletoString(divi));
	}
	public static void RaizCuadrada() {
		System.out.println("Introduce un número: ");
		int raiz_cuadrada = sc.nextInt();
		Double rq = Math.sqrt(raiz_cuadrada);
		System.out.println("La raiz cuadrada es: " + DoubletoString(rq));
	}
	
	public static void main(String[] args) {

		Menu();


	}


}