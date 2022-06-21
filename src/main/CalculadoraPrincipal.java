package main;
import java.util.Scanner;

import main.Calculadora.Calculadora;
import main.Controller.ConsoleController;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		Double a = 0.0, b = 0.0, c = 0.0;
		Byte op = -1;
		ConsoleController.consoleView(a, b, c, op, s, calc);
	}

}
