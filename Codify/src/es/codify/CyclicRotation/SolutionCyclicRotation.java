package es.codify.CyclicRotation;


public class SolutionCyclicRotation {

	public int[] solution(int[] A, int K) {

		if(A.length<=1 || A==null )
			return A;

		K=K%A.length;
		int[] cop = new int[A.length];
		int seg = 0;
		for(int i = 0; i < A.length; i++){
			seg = i + K;
			if(seg >= A.length)
				cop[seg-A.length]=A[i];
			else
				cop[seg]=A[i];
		}
		return cop;
	}



}
