package codityJava;


public class CyclicRotation {
	
	
	public int[] solution(int[] A, int K) {

		int[] newOrder = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			int newPosition = (i + K) % A.length;// save new position index

			newOrder[newPosition] = A[i];
		}

		return newOrder;
	}// end Solution

	public static void main(String[] args) {

		CyclicRotation c = new CyclicRotation();
		int[] Arr = { 1, 2, 3, 4 };
		int K = 4;

		for (int i = 0; i < c.solution(Arr, K).length; i++) {
			System.out.println("--------------------------------\n" + "Array Shifted: " + c.solution(Arr, K)[i]);
		}

	}

}
