/*
 * ����5. 1~20 ������ � ���ε� ������ �������� ���� ���� ���� ���ΰ�?
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
