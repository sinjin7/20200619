/*[2]
 *	논리연산자 => if문에 주로 사용
 *	형식)	&&(직렬연산), ||(병렬연산)
 *			==========	==========
 *			두개 true		한개이상 시 true
 *중요쓰   && => 범위, 기간을 포함 시 
 *		|| => 범위나 기간을 벗어나는 경우에 주로 사용
 *
 *		jumsu>90 (&&) jumsu<=100 사이
 *		jumsu<=0  ||  jumsu>100			범위 벗어났을 시 
 *		
 *		조건 (&&,||) 조건
 *		===			==			
 *		true/false   true/false
 *
 *						&&		||
 *		==========================
 *		true true 		true true
 *		==========================
 *		true false		false true
 *		==========================
 *		false true 		false true
 *		==========================
 *		false false 	false false
 *		==========================
 *		
 *		6<5	&&	10==10
 *		===		======
 *		false && true => false
 *
 *		효율적인 연산 = 단축계산
 *		int a=10;
 *		int b=9
 *
 *		a<b &&  ++b==a => false
 *		왼쪽에서 false 면 오른쪽은 계산 안함
 *		or 이면 계산함.
 *				=======
 *				 연산 수행 여부
 *중요쓰   && => 왼쪽에 있는 조건이 false
 *		|| => 왼쪽에 있는 조건이 true 
 *		
 *
 *
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		int i =65;
		char c2 = 'B';
			boolean bCheck=c1==i || ++c1==c2;
		System.out.println(bCheck);
		System.out.println(c1);
			
		/*System.out.println(c1==i || ++c1==c2);
		System.out.println(c1);*/
		
	}

}
