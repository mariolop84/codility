package es.codify.FrogRiverOne;

import java.util.Arrays;

public class FrogRiverOne {

	public int solution(int X, int[] A) {

		int[] cont = new int[X + 1];
		int sal = 0;
		for (int i = 0; i < A.length; i++) {
			
			if (cont[A[i]] == 0) {
				cont[A[i]] = A[i];
				sal++;
			}
			
			if(sal == X)
				return i;
		}
		return -1;
	}
}
