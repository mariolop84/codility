package es.codify.principal;

import es.codify.CyclicRotation.SolutionCyclicRotation;
import es.codify.OddOccurrencesInArray.OddOccurrencesInArray;
import es.codify.TapeEquilibrium.TapeEquilibrium;
import es.codify.binaryGap.SolutionBinaryGap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SolutionBinaryGap sol = new SolutionBinaryGap();
		
		/*SolutionCyclicRotation  cy = new SolutionCyclicRotation();
		int[] ent = {3};
		int[] sal = cy.solution(ent ,3);*/
		
		/*int[] A={7};
		OddOccurrencesInArray oc = new OddOccurrencesInArray();
		System.out.println(oc.solution(A));*/
		
		//int[] A = {3,1,2,4,3};
		int A[] ={-1000,1000};
		TapeEquilibrium te = new TapeEquilibrium();
		System.out.println(te.solution(A));
			
		
	}

}
