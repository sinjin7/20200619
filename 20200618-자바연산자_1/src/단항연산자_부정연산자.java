/*[2]
 * ���� ������ : !
 * 	=> true=>false , false=>true
 *  => ����� : boolean
 *  
 *  	���� : ���� => int
 *  		  ���� => boolean
 *  	���� : 
 *  		  ��� => ?
 *      		int + int + int
 *      		double + int + double
 *       	 �� , �� => boolean
 *       
 * ���� ������
 * 	����? ��1 : ��2
 *  sex==1?"����":"����"
 *  sex==1?'M':'W'
 *   (���ǽ�) ? A : B �� ���ϸ� ������ true �̸� A ����, 
 *   							false �� B ����
 *  
 *  
 */
public class ���׿�����_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=true;
		bCheck=!bCheck;//true�� �ݴ밪�� �����Ѵ�
		bCheck=!bCheck;
		
		System.out.println("bCheck="+bCheck);
	}

}
