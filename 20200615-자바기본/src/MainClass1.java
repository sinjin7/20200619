
public class MainClass1 {
   public static void main(String[] args) {
	    // ǥ�� => �ڹ�
	   /*
	    * ����
	    * 	= 10���� 10,20...
	    * 	= 8����
	    * 		011 => 9
	    * 	= 16����
	    *		0x10
	    *		== 		
	    *	= 2����
	    *		0b1010	
	    *		==
	    * �Ǽ�
	    * 	= ���� ũ�� => 4byte 10.5f �Ҽ��� 8�ڸ� ����
	    * 	= ���� ũ�� => 8byte 10.5 �Ҽ��� 16�ڸ�����
	    * ����
	    * 	=' ' => �ѱ��ڸ� ����
	    * ���ڿ�
	    * 	=" " => �������� ����
	    * 	ASC (C) =======> 1byte
	    * 	Unicode (�ڹ�) => 2byte
	    * 
	    * 	UTF-8
	    * 
	    */
   		System.out.println('ȫ');
   		System.out.println("Hello");
   		System.out.println(10.5);
   		System.out.println(10.5f);
   		System.out.println(10.5F);
   		
   		System.out.println(10);// ���������Ʈ�� 10�� ���
   		System.out.println(0b01010);
   		System.out.println(012);
   		System.out.println(0xA);
   		/*
   		 * 	1.�⺻����
   		 *  ========
   		 *  	=>��ҹ��� ����
   		 *  		=>���̺귯��(Ŭ����:��ҹ���, �޼ҵ�� �ҹ���, ����� ��� �빮��)
   		 *  	PI=3.14
   		 *  
   		 *  	����/��� (����� ��Ȥ���� ����)
   		 *  
   		 *  	int kor=100;
   		 *  	final int Kor=200;
   		 *  
   		 *  	=> ��ɹ��� ���ᰡ �Ǹ� �ݵ�� : �����ݷ��� ����Ѵ�.
   		 *  
   		 *	3.�鿩���� 	
   		 *  
   		 */
}
}
