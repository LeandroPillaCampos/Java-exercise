package codityJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingInteger {

	
	// https://app.codility.com/demo/results/training6PNNMD-8PG/
		
		
	public int solution(int[] A) {

		
		

		TreeSet<Integer> sorted = new TreeSet<Integer>(); // Use the propieties of TreeSet for sort and delete
															// duplicates elements

		
		
		for (int a : A ) { // Array to TreeSet and discart negatives numbers	
			if(a>0)sorted.add(a);
		}
		
		
		
		if (!sorted.contains(1)) return 1;
		
		
		
		for (int i=0;i<sorted.size();i++) {
			
			if(!sorted.contains(i+1)) return i+1;
			
			if(sorted.size()==i+1) return sorted.size()+1;
			
		}
		
		
		return 1;
		 
		
		

	}// fin solution

	public static void main(String[] args) {

		int[] A = { 1, 1, 2, 2, 3,6 ,4 };
		
		MissingInteger m=new MissingInteger();
		System.out.println(m.solution(A));

		/*
		 * Arrays.sort(A);
		 * 
		 * 
		 * 
		 * for(int a : A) { System.out.println(a); }
		 */

		
		
		/*
		 * TreeSet<Integer> sorted=new TreeSet<Integer>();
		 * 
		 * for(int a : A) { sorted.add(a); }
		 * 
		 * 
		 * sorted.forEach ( a -> System.out.println(a) );
		 */
		 

	}

}
