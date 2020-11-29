/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

/**
 *
 * @author macbookpro
 * Akassa Fall 
 * 
 * Test veut tester le push 
 */
public class Calculator {

   //Cette methode nous permet de faire la somme de deux entiers
	public int sum(int a, int b) {
		return a + b;
	}
	//Cette methode nous permet de faire la soustraction de deux entiers
	public int minus(int a, int b) {
		return a - b;
	}
	//Cette methode nous permet de faire la division de deux entiers
	public int divide(int a, int b) {
		return a / b;
	}
	//Cette methode nous permet de faire la multiplication de deux entiers
	public int multiply(int a, int b) {
		return a * b;
	}
	//Cette methode nous permet de savoir le minimum entre deux entiers
	public int min(int a,int b) {
			return Math.min(a,b);
	}
	//Cette methode nous permet de savoir le maximum entre deux entiers
	public int max (int a , int b) {
		 
			return Math.max(a,b);
	}
	//Cette methode nous permet de savoir le plus petit entier dans un tableau donne
        public int minElement(int[] liste){
            int min=liste[0];
            for(int i:liste){
                if(i<min)
                    min=i;

            }
            return min;
        }
	//Cette methode nous permet de savoir le plus grand entier dans un tableau donne
        public int maxElement(int[] list){
            int max=list[0];
            for(int i : list){
                if(i>max)
                    max=i;
            }
            return max;
        }

	public static void main(String[] args) {
		System.out.println("Akassa Fall");
	}

}