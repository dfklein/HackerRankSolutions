package br.com.klein.denis.practice.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles 
 * @status Resolvido
 */
public class C09BirthdayCakeCandles {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        Arrays.sort(ar);
        int maiorTamanho = ar[ar.length-1];
        int contagem = 0;
        for (int i : ar) {
        	if (i==maiorTamanho) {
				contagem++;
			}
        }
        System.out.println(contagem);
        
	}

}
