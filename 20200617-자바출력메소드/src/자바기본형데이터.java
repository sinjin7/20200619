/*
 * �ڹ� => �⺻��
 * 		�ڹٿ��� �����ϴ� ��������
 * 		���� => boolean => �� : true/false : if(���ǹ�) �� ����Ҷ� �ַ� ����ϴ� ��������
 * 											          ex) �� 
 * =====> upcasting (�ڵ�����ȯ) 
  	// byte < shotr(char) < int < long < float < double
 *                    <=========== downcasting (��������ȯ)  
 * 	   double d='a'; => d=97.0
 * 	   char c='a'
 *     int i='A' => i=65
 *     
 *     �����ϸ� �ٿ�ĳ���� ��ǻ�Ͱ��ϸ� �� ĳ���� 
 *     
 *     byte b1 =10;
 *     byte b2 =20;
 *     byte b3=b1+b2 (error)    => int  �� ����ȯ �������..!
 *     
 *     (int)
 *      
 *      
 *     
 */
public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� ���
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
		
		System.out.println((int)'ȫ');
		System.out.println((char)54861);
		// �����ڴ� ���ڹ�ȣ�� ������ �ִ� (char �� ���������� �ν��Ѵ�)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
