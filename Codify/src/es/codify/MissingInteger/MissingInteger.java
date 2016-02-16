package es.codify.MissingInteger;

import java.util.Arrays;


public class MissingInteger {

	public int solution(int[] A) {
		Arrays.sort(A);
		int minValue = 1;
		for (int value : A) {
			if (value == minValue) {
				minValue++;
			}
		}
		return minValue;

	}
}
