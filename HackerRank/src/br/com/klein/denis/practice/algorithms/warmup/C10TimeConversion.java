package br.com.klein.denis.practice.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion 
 * @status Resolvido
 */
public class C10TimeConversion {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String periodo = s.substring(8,10);
        int hora = Integer.valueOf(s.substring(0,2));
        String minSeg = s.substring(2,8);

        String retorno = "";
        if(periodo.equals("AM") && hora == 12) {
        	retorno = "00" + minSeg;
        } else if(periodo.equals("PM") && hora == 12) {
        	retorno = "12" + minSeg;
        } else if(periodo.equals("PM") && hora < 12) {
        	retorno = hora + 12 + minSeg;
        } else if(periodo.equals("AM") && hora < 10){
        	retorno = "0" + hora + minSeg;
        } else {
        	retorno = hora + minSeg;
        }
        System.out.println(retorno);
        
	}
}
