/*[3]
 *	필요시에 데이터형을 변경해서 사용 : 강제 형변환
 *
 *	int + double = double (자동 형변환)
 *	===
 *	double
 *
 *	char + int = int
 *	===
 *	int
 *
 *	int + long = long
 *	===
 *	long
 *	
 *	char + int + long + double = double
 *	처음부터 더블로 바뀌진 않는다. , 속도가 느려짐 특별한 이유 없으면 여러 데이터 사용 하지않기.
 *
 *	(int)double => int => 큰데이터 ~> 작은데이터 변경
 *	(char) int => char
 *
 *	1) boolean 은 제외
 *	2) int 이하는 연산을 하면 결과값이 int
 *	 byte + byte => int
 *	 char + char => int
 *	 char + byte => int
 *	 char + byte + short => int
 *
 *
 *
 */
public class 단항연산자_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*byte b=10;
		byte c=20;
		int d=b+c;
		System.out.println("d="+(b+c));
		/*int d=b+c(이방법이 정석) , byte d=(int)(b+c)*/
		//자동형변환*/
		int a='A'; // a=65
		double d=10; // d=10.0
		//		int
		char c=65; // c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
	}

}
