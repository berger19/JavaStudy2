/*
 * 		Ŭ������ ����
 * 		class class_name{
 * 			���� ���� => �ɹ�����(��������), Ŭ���� �ɹ�����
 * 			�޼ҵ� ����
 * 			main(){
 * 			
 * 			}
 * 		}
 * 		Ŭ������ �������
 * 			1) ����
 * 			2) �޼ҵ� => ������ +���
 */
public class Sawon {
	static int sabun;//�����==>������ ����(���뺯��)=>�޸� ������ 1�� �����Ͽ� ������ �ϹǷ�
	String name;//�޸𸮰��� �Ҵ�ȵ�==>��ü����=��ü�� �����ø��� ���� ��������
	String dept;//�ν��Ͻ�������  ������ �������� �޸𸮸� ���ε��� ���� ������ ������� ����
	String loc;//�ν��Ͻ� ������ �ɹ������� ������ �� �ִ�.
	long pay;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s=new Sawon();//�Ҵ� ���� ���� �����͸� �޸� �Ҵ� ����(4��)
		System.out.println("s="+s);
		s.sabun=10;
		s.name="ȫ�浿";
		Sawon s2=s;
		System.out.println("s2="+s2);
		Sawon s1=new Sawon();//4���� �����͸� �� �޸𸮸� �Ҵ���
		System.out.println("s1="+s1);
		s1.sabun=20;
		s1.name="��û��";
		s2.name="������";
		System.out.println("s.sabun : "+s.sabun);
		System.out.println("s.name : "+s.name);
	}

}
