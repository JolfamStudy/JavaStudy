/*
 * 문제6. 1부터 100까지의 합의 제곱 - 제곱의 합은?
 */
public class Problem_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int square = 0;
		
		for(int i=1; i<=100; i++){
			sum = sum + i;
			square = square + (i * i);
		}
		
		int result = (sum*sum) - square;
		System.out.println("sumS  :  " + sum*sum);
		System.out.println("Ssum  :  " + square);
		System.out.println(result);
		
	}

}
