/*
 * 	1. 데이터형(자료형)
 * 		정수,실수,문자,논리 
 * 
 * 		총알 => x,y => 좌표(int) 
 * 		키보드 값 => char
 * 
 * 		총 점수를 누적하게 되면 => long
 * 		점수에 대한 평균 => double
 * 
 * 		게임 종료 여부 확인 => true/false => boolean
 * 		======================================
 *  2. 데이터 저장 방법
 *  = 한개 저장 =>
 *  			변경해서 사용 데이터 : 변수 	데이터형 변수명
 *  			변경하지 않는 데이터 : 상수 	final 데이터형 변수명
 *  
 *  = 여러개 저장 => 같은 유형 (배열)
 *  = 여러개 저장 => 다른 유형 (클래스) => 사용자 정의 데이터형 
 *  
 *  3. 메모리를 만드는 방식 => 변수선언
 *  	데이터형 변수명;
 *  	 예) 정수
 *  		  int	=> int a;
 *  		  long	=> long a;
 *  		실수
 *  		  double	=> double d;
 *  		문자
 *  		  char	=> char c; 
 *  		논리
 *  		  boolean	=> boolean b;
 *  
 *  4. 변수에 대한 초기값
 *  	int a=0;
 *  	long a=0L;
 *  	double a=0.0
 *  	boolean b=false;
 *  	char c='A'
 *  
 *  5. 변수값을 변경하는 방법
 *  	int a=10;
 *  
 *  	a=100;
 *  	b=200;
 *  	c=300;
 *  
 *  6. 변수와 변수의 교환
 *  	=> temp 라는 입시변수가 필요하다
 *  
 *  7.25page 참조
 *    ==========
 *    변수명을 만들때 사용하는 방법 (식별자)

 */
public class 자바변수값교환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		int y=100;
		int temp=x; //100
		x=y;
		// y=200 =>		x=y => x=200
		y=temp; // y=x => x=200 => y=200		
			
				
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
