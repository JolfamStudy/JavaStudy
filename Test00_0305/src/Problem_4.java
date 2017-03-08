/*
 * 문제 4. 세 자리 수를 곱해서 만들 수 있는 가장 큰 대칭수는?
 */
public class Problem_4 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		//가장 큰 대칭수를 찾는 문제 거꾸로 접근하는게 빠를듯.
		//배열을 통해서 비교.
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
