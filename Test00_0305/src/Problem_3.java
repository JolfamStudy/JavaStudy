/*
 * 문제 3. 소인수 구하기 
 * 600851475143의 소인수 중 가장 큰 수를 구하라
 */
public class Problem_3 {
	
	public static void main(String[] args) {
	
		long insert = 600851475143L;
		//2부터 시작
		//나머지가 나오면 다음 숫자로 나눈다 2->3
		//insert가 0보다 클 때까지
		int i = 2;
		while(insert>0){
			if(insert%i==0){
				System.out.println(i);
				insert = insert / i;
			}else{
				i++;
			}
			
		}

	}
}
