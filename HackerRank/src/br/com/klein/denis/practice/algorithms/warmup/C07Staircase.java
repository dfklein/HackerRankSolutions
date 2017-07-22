package br.com.klein.denis.practice.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase 
 * @status Resolvido
 * 
 * Explica��o: quando o �ndice da linha somado ao �ndice da coluna � maior ou igual ao calor m�ximo poss�vel de �ndice da coluna, ent�o
 * voc� deve imprimir o #.
 */
public class C07Staircase {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long matriz[][] = new long[n][n];
        
        int colunaMax = n-1;
        
        for (long indiceLinha = 0; indiceLinha<n; indiceLinha++) {
        	for (long indiceColuna=0; indiceColuna<n; indiceColuna++) {
        		if(indiceLinha + indiceColuna < colunaMax) {
        			System.out.print(" ");
        		} else if (indiceLinha + indiceColuna >= colunaMax && indiceColuna < colunaMax){
        			System.out.print("#");
        		} else if(indiceColuna == colunaMax) {
        			System.out.print("#\n");
        		}
        	}
        }
        
    }
}
