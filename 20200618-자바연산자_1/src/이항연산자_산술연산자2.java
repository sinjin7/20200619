/*[5]
 * 	'A'+'B'
 * 	===	== 66
 * 	정수변환 => 65
 * 	65 + 66 => 131 (int)	char,short,byte=>연산=>결과값int
 *  범위 벗어나면 X.
 * 
 * *** 주의점 : 데이터형을 초과하면 error 가 아니라 오버플로워를 발생
 * 
 * 예) int => 1~10		11=>1
 * 
 * 	10+10.5
 *  ==
 *  10.0  ==> 같은 데이터형만 연산이 가능
 *  
 *  'A'+1 => int
 *  ===
 *  65
 *  
 *  강제형변환
 *  	(int)(10.5+10.5)
 *  
 *      (int)10.5+(int)10.5
 *      
 *      & => *를 한다
 *      | => +를 한다
 *      ^ => 다른 비트 찾는다
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=64;
		byte b2=64;
		byte b3=(byte)(b1+b2);
		System.out.println("b3="+b3);
		// % => double + int + char => double
		
		int a=5;
		int b=2;
		
		System.out.println(a%b); //	5%2    => 1
		System.out.println(-a%b);//	-5%2   => -1
		System.out.println(a%-b);// 5%-2   => 1 
		System.out.println(-a%-b);// -5%-2 => -1
		
		System.out.println((int)(10.5+10.5));
		System.out.println((int)10.5+(int)10.5);
		
		
		
	}

}
