/*
 * 		맴버 변수(클래스 종료시까지 사용이 가능하다.)
 * 			= static : 클래스 변수(클래스 명을 통해서 사용이 가능)
 * 					=>같은 클래스 객체는 공통으로 사용되는 변수
 * 					=>컴파일시 메모리 할당이 되며, 
 * 					     가상 머신(가상메모리)이 클래스로더를 통해서 메모리가 할당이 된다.
 * 
 * 			= instance : 객체변수(객체를 생성하고 사용이 가능함)
 */
import javax.swing.*;
public class 맴버변수 {
	String name="심청이";//null값인 상태
	String tel;
	String addr;
	void setAaa(){
		String name="홍길동";
		System.out.println(this.name);//지역변수가 우선순위 그다음 맴버변수
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		맴버변수 a=new 맴버변수();//name변수가 저장이 되는 시점이다.
		a.name=JOptionPane.showInputDialog("이름 입력 : ");
		a.tel=JOptionPane.showInputDialog("전화번호 입력 : ");
		a.addr=JOptionPane.showInputDialog("주소 입력 : ");
		String result="이름 : "+a.name+"\n"
					  +"전화번호 : "+a.tel+"\n"
					  +"주소 : "+a.addr+"\n";
		JOptionPane.showMessageDialog(null, result);
	}

}
