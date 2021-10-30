package codityJava;

public class OddOccurrencesInArray {
	
	
	public static int solution(int[] A) {
		
		int unpaired = 0;

		for (int i = 0; i < A.length; i++) {
			
			unpaired= unpaired^A[i];
			//C=C^D  Change values(C and D) to binaries numbers. Then, is save this binary result in C.
			//
			//XOR solo deja pasar lo que no sea igual. Por ende, lo que queda en la variable es el que no tiene par.
			//Todo el resto de valores se "cancelan" entre si
			
			
		}
		return unpaired;
	}

	public static void main(String[] args) {
		
		System.out.println(solution(new int[] { 9, 3, 9, 3, 9 }));
	}

}
