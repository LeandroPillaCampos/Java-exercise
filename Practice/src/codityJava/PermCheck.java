package codityJava;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {
	
	//https://app.codility.com/demo/results/trainingJXWZNA-Z7S/
	
	//https://app.codility.com/demo/results/trainingCAWZF5-42P/
	
	public int solution(int[] A) {
		
		Set set=new HashSet();
			
		for(int i=1;i<=A.length;i++) {
			set.add(i);
			
		}//end FOR
		
		for(int a : A) {	
			if(!set.contains(a)) {
				return 0;
			}else set.remove(a);
		
		}//end FOR
		return set.isEmpty() ? 1:0;
	}//end solution

	public static void main(String[] args) {
		int[] A= {4,1,3,2,5,9,6,7,8};
		PermCheck p=new PermCheck();
		System.out.println(p.solution(A));
		
		

	}

}
