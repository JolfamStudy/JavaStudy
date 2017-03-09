/*
 * 문제 4. 세 자리 수를 곱해서 만들 수 있는 가장 큰 대칭수는?
 */
public class Problem_4 {

	public static void main(String[] args) {
		
		for(int num1=100; num1<=999; num1++){
			for(int num2=100; num2<=999; num2++){
				int result = num1 * num2;				
				if(result<100000){
					
				}else{
					//System.out.println(num1+" x "+num2 +" = " +result);
					int[] array = new int[6];
					int temp = result;
					for(int i=5; i>=0; i--){						
						array[i] = temp%10;
						temp = temp/10;
					}
					if(array[0]==array[5] && array[1]==array[4] && array[2]==array[3]){
						System.out.println(result);
					}					
				}
			}//END for num2
		}//END for num1
	}//END main
}
