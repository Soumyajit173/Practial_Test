//Write a program to find the sum of even numbers between 25 to 51.

package com.anudip.test;

public class EvenSum {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 25; i<=51; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of even numbers between 25 to 51 is: "+sum);
	}
}
