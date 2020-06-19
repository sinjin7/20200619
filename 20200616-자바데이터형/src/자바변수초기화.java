
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*int kor=78;
         int eng=85;
         int math=96;
         /*
          * 문자열 결합
          * ========
          * 	7+7"1"7+7
          *     ==
          *     14+"1"
          *     =====
          *     "141"+7
          *     "1417"+7
          *     "14177"
          *     
          *     "총점:78"+85 => 총점:78596
          */
         
         /*
         
         System.out.println("총점:"+kor+eng+math);
	}

}*/
		
		int a=97;
		char b=97;// char => 문자, 숫자
		System.out.println("a="+a);
		System.out.println("b="+b);

		int d=1;
		int e='1';
		System.out.println("d="+d);
		System.out.println("e="+e);
		 // char 는 문자, 정수 취급한다
		/*
		 * long = int
		 *  8      4
		 *  
		 *  int = long
		 *  4      8 => error
		 *  double = int, long,float
		 *  int = double(x)
		 *  
		 *  예외 => char =int
		 */
		float f=10.6f;
		double ii=1;
		
		// byte < char < int < long < float < double
		System.out.println(100); //100은 int
		System.out.println(10.8);// 10.8 double
		
		double i=2140000000L;
	}

}



