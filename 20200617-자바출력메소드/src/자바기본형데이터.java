/*
 * 자바 => 기본형
 * 		자바에서 지원하는 데이터형
 * 		논리형 => boolean => 값 : true/false : if(조건문) 을 사용할때 주로 사용하는 데이터형
 * 											          ex) 턴 
 * =====> upcasting (자동형변환) 
  	// byte < shotr(char) < int < long < float < double
 *                    <=========== downcasting (강제형변환)  
 * 	   double d='a'; => d=97.0
 * 	   char c='a'
 *     int i='A' => i=65
 *     
 *     내가하면 다운캐스팅 컴퓨터가하면 업 캐스팅 
 *     
 *     byte b1 =10;
 *     byte b2 =20;
 *     byte b3=b1+b2 (error)    => int  로 형변환 해줘야함..!
 *     
 *     (int)
 *      
 *      
 *     
 */
public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용 방법
		boolean b=false; //False(X) => 1byte
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		System.out.println(Integer.toBinaryString(300));
		byte a=10;
		byte b1=30;
		int c=(a*b1);
		System.out.println("c="+c);
		
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println((int)'홍');
		System.out.println((char)54861);
		// 각문자는 숫자번호를 가지고 있다 (char 는 정수형으로 인식한다)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
