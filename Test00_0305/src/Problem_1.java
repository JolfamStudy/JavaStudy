/*
 * ���� 1. 1000���� ���� �ڿ��� �߿��� 3 �Ǵ� 5�� ����� ��� ���ϸ� ���ϱ��?
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
