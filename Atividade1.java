package exerciciosMatriz;
import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	    int m[][] = new int[5][5];
	    int pares=0;

	  //Entrada de dados
	    for (int i=0; i<5; i++) {
		    for (int j=0; j<5; j++) {
		    	pares = (int)Math.round(Math.random()*100);
	    if (pares % 2 == 0) {
	    	 m[i][j] = pares;  
	    	 System.out.println("A matriz par resultante é: "+ pares);	
	    }
	    else {
	    	System.out.println("Essa matriz é impar");
	    
	    
	    
	    ler.close();
	   
	}
	    }
	}
}}