package com.test;

public class ArrayGame {
	public static void main(String[] args) {
		System.out.println(countMoves(new int[]{3,4,6,6,3}));
		
	}
	public static long countMoves(int numbers[]) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<numbers.length; i++) {
			min =Math.min(min, numbers[i]);
		}
		long sum =0;
		for(int i:numbers) {
			sum += i-min;
			}
		System.out.println("here is the result.."+sum);
		return sum;
		
	}

}
