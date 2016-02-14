package es.codify.binaryGap;

public class SolutionBinaryGap {

	public int solution(int N) {
		String numBin = "" + Integer.toBinaryString(N);
		int lastZero = numBin.lastIndexOf("0")+1;
		String[] lstBin = numBin.split("1");
		
		if(lastZero==numBin.length())
			return maxElementMin1(lstBin);
		else 
			return maxElement(lstBin);
	}
	
	private static int maxElement(String... lista){
		int sal = 0;
		for(int i = 0; i < lista.length ; i++){
			if(lista[i].length()>sal)
				sal =lista[i].length();
		}
		return sal;
	}
	
	private static int maxElementMin1(String... lista){
		int sal = 0;
		for(int i = 0; i < lista.length-1 ; i++){
			if(lista[i].length()>sal)
				sal =lista[i].length();
		}
		return sal;
	}
}
