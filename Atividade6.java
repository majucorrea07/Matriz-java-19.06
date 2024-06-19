package exerciciosMatriz;

public class Atividade6 {

	public static void main(String[] args) {
		char dB[][] = new char [4][4];

		for (int i=0; i< 4; i++) {
			for (int j=0; j< 4; j++) {
				if (j==(4 - 1 - i)) {
					dB[i][j]='*';
				} else {
					dB[i][j]=' ';
				}
			}
		}

		System.out.println("Figura B: ");
		for (int i=0; i<4; i++) {
		    for (int j=0; j< 4; j++) {
		    	System.out.print(dB [i][j] + " ");
			}
			System.out.println();
		}
	}
}
