package main.Controller;

import java.util.Scanner;

import main.Calculadora.Calculadora;

public class ConsoleController {
	public static void consoleView(Double a, Double b, Double c, Byte op, Scanner s, Calculadora calc) {
		while (op != 0) {
			System.out.println("1 para somar, 2 para subtrair, 3 para dividir, 4 para multiplicar, 0 para sair");
			switch (op = s.nextByte()) {
			case 1:
				System.out.println("Digite dois valores a serem somados:");
				a = s.nextDouble();
				b = s.nextDouble();
				c = calc.soma(a, b);
				System.out.println("O valor da soma é: " + c);
				break;
			case 2:
				System.out.println("Digite dois valores a serem subtraidos:");
				a = s.nextDouble();
				b = s.nextDouble();
				c = calc.sub(a, b);
				System.out.println("O valor da subtração é: " + c);
				break;
			case 3:
				System.out.println("Digite dois valores a serem divididos:");
				a = s.nextDouble();
				b = s.nextDouble();
				c = calc.divi(a, b);
				System.out.println("O valor da divisão é: " + c);
				break;
			case 4:
				System.out.println("Digite dois valores a serem multiplicados:");
				a = s.nextDouble();
				b = s.nextDouble();
				c = calc.mult(a, b);
				System.out.println("O valor da multiplicação é: " + c);
				break;
			case 0:
				System.out.println("Você escolheu sair, ate mais.");
				break;
			default:
				System.err.println("Esse opção não existe.");
				break;

			}
		}
	}
}
