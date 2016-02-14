package es.codify.OddOccurrencesInArray;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public int solution(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i + 1])
				i++;
			else
				return A[i];

		}
		return A[A.length - 1];
	}
}
