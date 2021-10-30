package codityJava;
import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
	
	//https://app.codility.com/demo/results/trainingWNT5RW-K2C/
	
	public int solution(int[] A) {
		int missing=0; 
	    int maxElem = A.length + 1;
	    
	    Set<Integer> totalElem = new HashSet<Integer>();
	    
	    for(int i=0; i<A.length; i++) {
	      totalElem.add(A[i]);
	    }

	    for(int i=1; i<maxElem+1; i++) {
	      if(!totalElem.contains(i)) { // HashSet/CONTAIN. Returns true if this set contains the specified element.
	        missing=i;
	      }
	    }
	    
	    return missing;
	  }

	public static void main(String[] args) {
		
		PermMissingElem e=new PermMissingElem();
		System.out.println("Valor perdido: "+ e.solution(new int[] { 1 }));

	}

}
