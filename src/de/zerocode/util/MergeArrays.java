package de.zerocode.util;

public class MergeArrays {
	public int[] getMerge(int[] inputOne, int[] inputTwo) {
		int size = inputOne.length+inputTwo.length;
		int [] temp = new int[size];
		for (int i = 0; i < temp.length; i++) {
			if(i>=inputTwo.length) {
				temp[i]=inputTwo[i-inputOne.length];
			}else {
				temp[i]=inputOne[i];
			}
		}
		return temp;
	}
	
}
