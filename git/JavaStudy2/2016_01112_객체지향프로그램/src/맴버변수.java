/*
 * 		�ɹ� ����(Ŭ���� ����ñ��� ����� �����ϴ�.)
 * 			= static : Ŭ���� ����(Ŭ���� ���� ���ؼ� ����� ����)
 * 					=>���� Ŭ���� ��ü�� �������� ���Ǵ� ����
 * 					=>�����Ͻ� �޸� �Ҵ��� �Ǹ�, 
 * 					     ���� �ӽ�(����޸�)�� Ŭ�����δ��� ���ؼ� �޸𸮰� �Ҵ��� �ȴ�.
 * 
 * 			= instance : ��ü����(��ü�� �����ϰ� ����� ������)
 */
import javax.swing.*;
public class �ɹ����� {
	String name="��û��";//null���� ����
	String tel;
	String addr;
	void setAaa(){
		String name="ȫ�浿";
		System.out.println(this.name);//���������� �켱���� �״��� �ɹ�����
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�ɹ����� a=new �ɹ�����();//name������ ������ �Ǵ� �����̴�.
		a.name=JOptionPane.showInputDialog("�̸� �Է� : ");
		a.tel=JOptionPane.showInputDialog("��ȭ��ȣ �Է� : ");
		a.addr=JOptionPane.showInputDialog("�ּ� �Է� : ");
		String result="�̸� : "+a.name+"\n"
					  +"��ȭ��ȣ : "+a.tel+"\n"
					  +"�ּ� : "+a.addr+"\n";
		JOptionPane.showMessageDialog(null, result);
	}

}
