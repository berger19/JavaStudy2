import javax.swing.JOptionPane;

public class �ɹ�����2 {
	static int hakbun;
	static int kor;
	static int math;
	static int eng;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("�������� : ");
		kor=Integer.parseInt(str);//�������� ���������� �ٲܶ� ���� ��ɹ�
								  //������â�� ���������� �ν��ϹǷ� ���� ��ɹ����
		str=JOptionPane.showInputDialog("�������� : ");
		eng=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("�������� : ");
		math=Integer.parseInt(str);
		String result="���� : "+(kor+eng+math)+"\n"+
					  "��� : "+((kor+eng+math)/3);
		JOptionPane.showMessageDialog(null, result);
		
	}

}
