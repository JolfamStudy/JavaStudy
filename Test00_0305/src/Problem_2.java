/*
 * ���� 2. �Ǻ���ġ �������� ¦���̸鼭 4�鸸 ������ ��� ���� ���ϸ� ��?
 */
public class Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fibo[] = new int[10000];
		int sum = 0;
		
		fibo[0] = 1;
		fibo[1] = 2;
		
		for(int i=2; i<40; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
			
			if(fibo[i] > 4000000){
				break;
			}
		}
		for(int i=0; i<40; i++){
			if(fibo[i]%2==0){
				sum += fibo[i];
				System.out.println(sum);
			}
		}
	}

}
