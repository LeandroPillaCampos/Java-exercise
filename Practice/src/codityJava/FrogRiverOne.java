package codityJava;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
	
	//https://app.codility.com/demo/results/trainingDJEJ9W-FCF/
	
	//https://app.codility.com/demo/results/trainingWZUTA6-H5K/
	
	//https://app.codility.com/demo/results/trainingFRTFG5-3Z5/
	
	public int solution(int X, int[] A) {
        Integer x=X;

        Set earliestSet=new HashSet();

        for(int i=0;i<A.length;i++){
            earliestSet.add(A[i]);

            if(earliestSet.size()< x) continue;

            if(earliestSet.contains(x)) return i;


        }//end FOR


        return -1;
       
    }//end solution
	
	

	public static void main(String[] args) {
		
		int[] array= {1,3,1,4,2,3,5,4};
		
		System.out.println("earliest position: "+new FrogRiverOne().solution(5, array));

	}

}
