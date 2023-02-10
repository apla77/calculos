package br.com.calculos;

public class Main {

	// token master :   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
	// token staging:   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
	// token operações: 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
	public static void main(String[] args) {
		
		final double valor; 
		Operacoes op = new Calculos();
		System.out.println("Ola Galerinha!!!");
		System.out.println("O total de 3 + 7 = " + op.soma(3, 7));
	}


}
