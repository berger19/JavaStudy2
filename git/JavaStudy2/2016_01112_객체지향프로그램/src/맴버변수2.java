import javax.swing.JOptionPane;

public class 맴버변수2 {
	static int hakbun;
	static int kor;
	static int math;
	static int eng;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("국어점수 : ");
		kor=Integer.parseInt(str);//문자형을 정수형으로 바꿀때 쓰는 명령문
								  //윈도우창은 문자형으로 인식하므로 위의 명령문사용
		str=JOptionPane.showInputDialog("영어점수 : ");
		eng=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("수학점수 : ");
		math=Integer.parseInt(str);
		String result="총점 : "+(kor+eng+math)+"\n"+
					  "평균 : "+((kor+eng+math)/3);
		JOptionPane.showMessageDialog(null, result);
		
	}

}
