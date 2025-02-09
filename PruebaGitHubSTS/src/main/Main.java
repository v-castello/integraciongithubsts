package main;

import entities.ObjectA;
import entities.ObjectB;
import entities.ObjectC;

public class Main {
	public static void main(String[] args) {
		ObjectA objetoA = new ObjectA(1, "Pepito", "Grillo");
		ObjectB objetoB = new ObjectB(1, "Alfredo", 25);
		ObjectC objetoC = new ObjectC(1, "Ana", "Valencia");
		
		System.out.println(objetoA.toString());
		System.out.println(objetoB.toString());
		System.out.println(objetoC.toString());
		
		ObjectC objetoC2 = new ObjectC(2, "Antonia", "Almeria");
		System.out.println(objetoC2.toString());
		
		ObjectB objetoB2 = new ObjectB(2, "Victor", 24);
		System.out.println(objetoB2.toString());
	}
}