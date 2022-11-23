package de.zerocode.util;

public class AdvancedCalculator extends BasicCalculator {
	public int getLargest(int first, int second) {
		if (first > second) {
			return first;
		}
		return second;
	}
	public int getLargest(int first, int second, int third) {
		if (first > second && first > third) {
			return first;
		} else if (second > first && second > third) {
			return second;
		}
		return third;
	}


	public int getSmallest(int first, int second, int third) {
		if (first < second && first < third) {
			return first;
		} else if (second < first && second < third) {
			return second;
		}
		return third;
	}

}
