package br.com.klein.denis.practice.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grading 
 * @status Pendente
 */
public class C01GradingStudents {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        
        List<Integer> retorno = new ArrayList<Integer>();
        OUTTER: for(int grade : grades) {
        	if(grade == 100) {
        		retorno.add(grade);
        		continue OUTTER;
        		
        	}
        	if(!(grade<38)) {
        		INNER: for(int i=grade; i<100; i++) {
        			if(!(i%5==0)) {
        				continue INNER;
        			}
        			if(i-grade<=2) {
        				retorno.add(i);
        				continue OUTTER;
        			} else {
        				retorno.add(grade);
        				continue OUTTER;
        			}
        		}
        		
        	} else {
        		retorno.add(grade);
        	}
        }
        
		for(Integer nota : retorno) {
			System.out.println(nota);
		}
	}

}
