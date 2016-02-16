package es.codify.zoo;

public class PhNum {
	public String solution(String S) {
		String sol = "";

		S = clean(S);
		if(S.length()<4)
			return S;
		
		return S;
		
	}

		

	private static String clean(String S) {
		S = S.replaceAll("\\s+", "");
		S = S.replaceAll("/", "");
		S = S.replaceAll("-", "");
		return S;
	}


}
