/*
 * 문제 1. 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
 */

public class Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		int num = 1000;
		int sum = 0;
		
		for(int i=0; i<num; i++){
			if(i%3 == 0 || i%5 ==0){
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
