/*[4]
 * 	응용시에 많이 사용하는 연산자
 * 		=> 증감연산자 (++,--)
 * 		=> 산술연산자(+,-,*,/)
 * 		=> 비교연산자, 온리연산자
 * 		=> 대입 (=, +=, -=)
 * 
 * 		=> 기타 연산자
 * 			=> 삼항연산자 => if~else => 게임
 * 				조건? 값1:값2
 * 				===
 * 				  => true => 값1
 * 				  => false => 값2
 * 
 */
import java.util.*;
//import java.lang.* => System,String,math
// 정수를 입력받아서 짝수/홀수
public class 이항연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
				//System.in : 키보드 입력
				//System.out : 화면
				
		System.out.print("정수입력:");		
		 // 입력받은 정수를 저장한다
		int a=scan.nextInt();*/
		
		int a=(int)(Math.random()*100)+1
		/*    ===== ================= =
		 * 	  	2		1			  3
		 * 	연산자 우선순위
		 * 1) ()
		 * 2) 단항연산자 
		 * 3) 이항연산자
		 * 	 (Math.random()*100)		
		     ==============
		        0.0~0.95 => 100 => 0.0~99.0
	     
	     *
	     *
	     *
	     */
	System.out.println("a="+a);
	System.out.println()
		
				
				
		System.out.println(a%2==0?"짝수입니다":"홀수입니다");			
				
	}

}
