package es.codify.TapeEquilibrium;

public class TapeEquilibrium {
	public int solution(int[] A) {
		int r = 0;
		int min = 0;

		for (int i = 0; i < A.length; i++) {
			r += A[i];
			min += Math.abs(A[i]);
		}

		int l = 0;

		for (int P = 0; P < A.length - 1; P++) {
			r -= A[P];
			l += A[P];

			if ((Math.abs(l - r)) < min) {
				min = Math.abs(l - r);
			}
		}
		return min;
	}
}
