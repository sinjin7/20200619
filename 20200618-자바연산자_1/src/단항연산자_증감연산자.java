/* [1]
 * 	1.	연산자
 * 		1)연산자의 종류
 * 			= 단항연산자
 * 				= *****증감연산자 (++ , --)
 * 				= *****부정연산자 (!)
 * 				= 부호연산자 (+ , -)
 * 				= *****형변환연산자 ((type))
 * 					type => int , byte , char , double, long...
 * 					(int)
 * 					(byte)
 * 					(char)
 * 					(double)
 * 					(long)
 * 					=> 데이터형을 변경해서 연산처리가 가능하게 만든다
 * 						(연산: 데이터형이 동일)
 * 			= 이항연산자
 * 				= *****산술연산자 ( + , - , * , / , % ) => 형변환
 * 					/
 * 					=> 0으로 나눌 수 없다
 * 					=> 정수/정수 =정수  ==> ex) 5/2=2
 * 					% => 나머지 (배수 / 왼쪽값의 부호를 따라감
 * 					=> 5%2 (1) 나머지값
 * 					=> 5%-2(1)
 * 					=> -5%2(-1)
 * 					=> -5%-2(-1)
 * 				= 비트연산자 ( &	|	^ ) 
 * 				= 쉬프트연산자 ( << , >> )
 * 				= *****비교연산자 ( == , != , < , > , <= , >= )
 * 				= *****논리연산자 ( $$ , || )
 * 				= *****대입연산자 ( = , += , -+ ... )
 * 			= 삼항연산자
 * 				= 조건 ? 값1:값2
 * 				  조건:true ==> 값1	
 * 				  조건:false ==> 값2	
 * 		2)연산방법
 * 			단항연산자
 * 			 = 증감연산자
 * 			  ++ : 무조건 한개를 증가한다	
 * 			  -- : 무조건 한개를 감소한다
 * 			     사용법
 * 				int a=10; 변수선언
 * 				++10(X)
 * 
 * 				==> ++a(--a) : 전치연산자
 * 					a++(a--) : 후치연산자
 * 					====================> 반복문을 사용, 게임로직
 * 					예) for(int i=1;i<=10;i++)
 * 										
 * 
 * 					전치연산자 : 증가 후 대입
 * 					int a= 10;
 * 					int b= ++a;
 * 						 ------
 * 						++ (1번계산)
 * 						=  (2번계산)
 * 						a=11 , b=11
 * 					후치연산자 : 대입 후 증가
 *           		int a= 10;
 *           		int b = a++
 *           			 ===  ===
 *           			  1    2
 *           			 ==> b=a => b=10
 *           			 ==> a++ => a=11
 *           부정연산자 (true=>false,false=>true) => !
 *           ======== 반드시 boolean 을 사용한다
 *           
 *           ex) boolean bCheck=false;
 *           !bCheck
 *            느낌표는 자동으로 바뀌지 않음
 *           bCheck=!bCheck 대입 시켜줘야 바뀜.
 *           ==> System.out.println(bCheck)
 *           
 *           int a=10;
 *           a=a+100;
 *            
 *            
 *           	
 * 		3)연산자 우선순위
 *  ()  괄호 우선순위
 *   3+8*4 => 곱하기 우선 
 * 		
 * 
 * 
 * 
 */
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=100; 
		 * System.out.println(a+200); 
		 * System.out.println(a);
		 */
		// a++ ==> a=a+1
		/*boolean bCheck=false;
		System.out.println(bCheck);
		bCheck=!bCheck;
		*/
		//전치연산
		int a=10;
		int b=++a;
		System.out.println("a="+a+",b="+b);
		//후치
		a=10;
		b=a++;
		System.out.println("a="+a+",b="+b);
		
		a=10;
		/*b=++a + ++a + ++a + ++a;*/
		// 11   12    13    14
		// a=14 , b=50
		b=a++ + a++ + a++ + a++;
		// 10   11   12    13
		// a=		
		System.out.println("a="+a+",b="+b);
		
		// 강제형변환
		int i=(int)10.5;
		int ii=(int)'A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
				
	}

}
