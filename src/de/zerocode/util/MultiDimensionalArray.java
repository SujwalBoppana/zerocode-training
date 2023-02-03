package de.zerocode.util;

public class MultiDimensionalArray {

	/**
	 * this method will gives sum of the elements present inside the two dimensional
	 * array
	 * 
	 * @author sujwal b
	 * @since 2022-11-30
	 * @param inputOne
	 * @return sum
	 * @throws Exception
	 */
	public int getSum(int[][] inputOne) throws ArrayIndexOutOfBoundsException {
		int sum = 0;
		for (int i = 0; i < inputOne.length; i++) {
			for (int j = 0; j < inputOne.length; j++) {
				sum += inputOne[i][j];
			}
		}
		return sum;
	}

	/**
	 * this method will gives product of the elements present inside the two
	 * dimensional array
	 * 
	 * @author sujwal b
	 * @since 2022-12-01
	 * @param inputOne,
	 * @param inputTwo
	 * @return product
	 * @throws Exception
	 */
	public int[][] getProductOfArray(int[][] inputOne, int[][] inputTwo) throws ArrayIndexOutOfBoundsException {
		int[][] temp = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				temp[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					temp[i][j] += inputOne[i][k] * inputTwo[k][j];
					System.out.print(temp[i][j] + " ");
				}
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		MultiDimensionalArray multi = new MultiDimensionalArray();
		int[][] inputOne = { { 1, 2, 3, 4, }, { 4, 5, 6, 7 }, { 7, 8, 9, 10 }, { 10, 11, 12, 13 } };
		System.out.println(multi.getSum(inputOne));
		int[][] first = { { 2, 2 }, { 3, 6 } };
		int[][] second = { { 2, 2 }, { 3, 6 } };
		multi.getProductOfArray(first, second);

	}

}
