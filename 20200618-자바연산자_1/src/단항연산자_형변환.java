/*[3]
 *	�ʿ�ÿ� ���������� �����ؼ� ��� : ���� ����ȯ
 *
 *	int + double = double (�ڵ� ����ȯ)
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
 *	ó������ ����� �ٲ��� �ʴ´�. , �ӵ��� ������ Ư���� ���� ������ ���� ������ ��� �����ʱ�.
 *
 *	(int)double => int => ū������ ~> ���������� ����
 *	(char) int => char
 *
 *	1) boolean �� ����
 *	2) int ���ϴ� ������ �ϸ� ������� int
 *	 byte + byte => int
 *	 char + char => int
 *	 char + byte => int
 *	 char + byte + short => int
 *
 *
 *
 */
public class ���׿�����_����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*byte b=10;
		byte c=20;
		int d=b+c;
		System.out.println("d="+(b+c));
		/*int d=b+c(�̹���� ����) , byte d=(int)(b+c)*/
		//�ڵ�����ȯ*/
		int a='A'; // a=65
		double d=10; // d=10.0
		//		int
		char c=65; // c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
	}

}
