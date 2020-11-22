/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

/**
 *
 * @author macbookpro
 */
public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	public int min(int a,int b) {
			return Math.min(a,b);
	}
	public int max (int a , int b) {
		 
			return Math.max(a,b);
	}
        public int minElement(int[] liste){
            int min=liste[0];
            for(int i:liste){
                if(i<min)
                    min=i;
                //salut
            }
            return min;
        }
        public int maxElement(int[] list){
            int max=list[0];
            for(int i : list){
                if(i>max)
                    max=i;
            }
            return max;
        }

}