/*[5]
 * 	'A'+'B'
 * 	===	== 66
 * 	������ȯ => 65
 * 	65 + 66 => 131 (int)	char,short,byte=>����=>�����int
 *  ���� ����� X.
 * 
 * *** ������ : ���������� �ʰ��ϸ� error �� �ƴ϶� �����÷ο��� �߻�
 * 
 * ��) int => 1~10		11=>1
 * 
 * 	10+10.5
 *  ==
 *  10.0  ==> ���� ���������� ������ ����
 *  
 *  'A'+1 => int
 *  ===
 *  65
 *  
 *  ��������ȯ
 *  	(int)(10.5+10.5)
 *  
 *      (int)10.5+(int)10.5
 *      
 *      & => *�� �Ѵ�
 *      | => +�� �Ѵ�
 *      ^ => �ٸ� ��Ʈ ã�´�
 */
public class ���׿�����_���������2 {

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
