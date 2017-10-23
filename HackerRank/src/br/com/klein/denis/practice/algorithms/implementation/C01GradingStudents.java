package br.com.klein.denis.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grading
 * 
 * @status Pendente
 */
public class C01GradingStudents {

	static int[] solve(int[] grades) {
		int[] resposta = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 38) {
				resposta[i] = grades[i];
				continue;
			}

			if (grades[i] >= 38) {
				int proximoMultiploCinco = i;
				for (int j = grades[i]; j <= 100; j++) {
					if (j % 5 == 0) {
						proximoMultiploCinco = j;
						break;
					}
				}
				if (proximoMultiploCinco - grades[i] < 3) {
					resposta[i] = proximoMultiploCinco;
				} else {
					resposta[i] = grades[i];
				}

			}
		}

		return resposta;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

	}

}
