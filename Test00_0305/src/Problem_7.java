/*
 * 문제7. 10,001번째 소수를 구하세요.
 */
public class Problem_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean check = true;
		int num = 3;
		int cnt = 1;
		
		while(check){
			//소수가 자기자신이랑 1로만 나눠지는 수.
			for(int i=2; i<num; i++){
				if(num % i == 0){
					//System.out.println(i);
					break;
				}
				if(i+1 == num){
					//System.out.println(num);
					cnt++;
				}
			}	
			
			if(cnt == 10001 ){
				System.out.println(num);
				check = false;
			}
			num++;
		}
		
	}

}
