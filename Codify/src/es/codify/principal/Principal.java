package es.codify.principal;

import es.codify.CyclicRotation.SolutionCyclicRotation;
import es.codify.FrogJmp.FrogJmp;
import es.codify.FrogRiverOne.FrogRiverOne;
import es.codify.OddOccurrencesInArray.OddOccurrencesInArray;
import es.codify.PermMissingElem.PermMissingElem;
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
		/*int A[] ={-1000,1000};
		TapeEquilibrium te = new TapeEquilibrium();*/
		
		/*FrogJmp fj = new FrogJmp();
		System.out.println(fj.solution(10, 85, 30));*/
		
		/*int A[] = {2};
		PermMissingElem p = new PermMissingElem();
		System.out.println(p.solution(A));*/
		
		//int[] A = {2,2,2,2,2,2};
		int[] A = {1,3,4,4,2,3,1,4};
		FrogRiverOne fro = new FrogRiverOne();
		System.out.println(fro.solution(5, A));
	}

}
