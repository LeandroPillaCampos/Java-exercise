package codityJava;

public class BinaryGap {

	public int solution(int N) {

		int primaryCount = 0;
		int secondCount = 0;
		String digits = Integer.toBinaryString(N);
		//System.out.println("N Binary:"+ digits);

		for (int i = 0; i < digits.length(); i++) {

			if (digits.charAt(i) != '0') {
				if (primaryCount < secondCount) {
					primaryCount = secondCount;
					secondCount=0;
				}//end IF
				continue;
			} else secondCount++;	
		}//end FOR

		return primaryCount;
	}//end solution

	public static void main(String[] args) {

		BinaryGap n = new BinaryGap();

		System.out.println(n.solution(1376796946));

	}//end main

}
