package es.codify.PermMissingElem;

import java.util.Arrays;

public class PermMissingElem {

	public int solution(int[] A) {

		
		Arrays.sort(A);
		int s = 0;
		for (int i = 0; i < A.length; i++) {
			if((i+1)!=A[i])
				return (i+1);
		}
		return A.length+1;
		
	}
}
