/*
 * 문제5. 1~20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마인가?
 */
public class Problem_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean check = true;
		int num = 2;
		int i;

		while(check){
			for(i=2; i<=20; i++){
				if(num % i > 0){
					num++;				
					break;
				}
				if(i==20){
					check = false;
					System.out.println(num);
				}				
			}
		}


	}

}
