/*
 * ���� 3. ���μ� ���ϱ� 
 * 600851475143�� ���μ� �� ���� ū ���� ���϶�
 */
public class Problem_3 {
	
	public static void main(String[] args) {
	
		long insert = 600851475143L;
		//2���� ����
		//�������� ������ ���� ���ڷ� ������ 2->3
		//insert�� 0���� Ŭ ������
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
