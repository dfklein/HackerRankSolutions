package br.com.klein.denis.practice.algorithms;

class Animal {
	static void doStuff() {
		System.out.println("a");
	}
}

class Dog extends Animal {
	static void doStuff() {
		System.out.println("d");
	}
	
}
public class Teste {

	public static void main(String[] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal() };
		for (int i=0; i< a.length ;i++) {
			a[i].doStuff();
		}
	}
}
