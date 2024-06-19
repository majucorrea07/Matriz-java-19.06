package exerciciosMatriz;

public class Atividade7 {

	public static void main(String[] args) {
		char dC[][] = {
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '},
				{'*','*','*','*','*'},
				{' ',' ','*',' ',' '},
				{' ',' ','*',' ',' '},
		};
		
		for (char[]letra:dC) {
			for (char coluna:letra) {
				System.out.print(coluna + "\t");
			}
				System.out.println();

	}
  }
}
