/*
 * ���� 4. �� �ڸ� ���� ���ؼ� ���� �� �ִ� ���� ū ��Ī����?
 */
public class Problem_4 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		//���� ū ��Ī���� ã�� ���� �Ųٷ� �����ϴ°� ������.
		//�迭�� ���ؼ� ��.
		//num[0] == num[5]
		// i = 999, j =999
		char[] array = null;
		
		for(int num1=999; num1>=100; num1--){
			for(int num2=999; num2>=100; num2--){
				int result = num1 * num2;
				
				String str = Integer.toString(result);
				
				for(int i=0; i<6; i++){
					array[i] = str.charAt(i);
					System.out.print(array[i]);
				}
				
				System.out.println(num1+" x "+num2 +" = " +result);
			}
		}
	}
}
