package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want the upper bound to be?");
		int n = in.nextInt();
		int[] range = new int[n];
		int value = 2;
		for (int i = 0; i < range.length; i++) {
			range[i] = value;
			value++;
		}// array is created, time to sieve 
		for (int j = 0; j < range.length; j++) {// outer for loop, goes through each part of the array
			if (range[j] != 0) {// if the number isn't prime, we multiply by it
				for (int k = range[j]; k < range.length-j; k = k + range[j]) {
					range[j + k] = 0;
	
					
				}
			}
			
			System.out.println(Arrays.toString(range));

			}
 
		}
		
		
	}


