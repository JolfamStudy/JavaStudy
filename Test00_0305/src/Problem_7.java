/*
 * ����7. 10,001��° �Ҽ��� ���ϼ���.
 */
public class Problem_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean check = true;
		int num = 3;
		int cnt = 1;
		
		while(check){
			//�Ҽ��� �ڱ��ڽ��̶� 1�θ� �������� ��.
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
