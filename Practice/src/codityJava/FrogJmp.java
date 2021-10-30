package codityJava;

public class FrogJmp {
	
	//https://app.codility.com/demo/results/trainingSDG3A4-GMY/
	
	public int solution(int X, int Y, int D) {
		
		int diff = Y - X;
	    int count = diff / D;
	    if (diff % D > 0) {
	        count++;
	    }
	    return count;
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("Cantidad de interaccciones: "+ (new FrogJmp().solution(10, 85, 30)));

	}//end main

}//end Class
