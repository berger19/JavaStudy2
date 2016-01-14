import javax.swing.*;
public class TestWin extends JFrame{//JFrame => 윈도우를 뜻함.(상속)
/*	JFrame f=new JFrame();
	TestWin(){
		f.setSize(800, 600); // 포함클래스가 변경이 용이하므로 포함클래스의 형태를 주로 씀
		f.setVisible(true); //(포함 클래스) f값에 의해 변경이 가능하다.
	}*/
	TestWin(){
		setSize(800, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWin t=new TestWin();
	}

}
