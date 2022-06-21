package main.Calculadora;

public class Calculadora {
	
	public Double soma(Double a, Double b) {
		return a+b;
	}
	
	public Double sub(Double a, Double b) {
		return a-b;
	}
	
	public Double mult(Double a, Double b) {
		return a*b;
	}
	
	public Double divi(Double a, Double b) {
		if(b == 0) {
			System.err.println("O dividendo não pode ser zero.");
			return 0.0;
		}
		return a/b;
	}
}
