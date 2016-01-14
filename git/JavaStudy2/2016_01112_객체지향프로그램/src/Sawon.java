/*
 * 		클래스의 구조
 * 		class class_name{
 * 			변수 설정 => 맴버변수(전역변수), 클래스 맴버변수
 * 			메소드 설정
 * 			main(){
 * 			
 * 			}
 * 		}
 * 		클래스의 구성요소
 * 			1) 변수
 * 			2) 메소드 => 연산자 +제어문
 */
public class Sawon {
	static int sabun;//저장됨==>공통사용 변수(공통변수)=>메모리 공간을 1개 생성하여 공통사용 하므로
	String name;//메모리공간 할당안됨==>객체변수=객체가 생성시만다 각각 생성변수
	String dept;//인스턴스변수는  각각의 변수마다 메모리를 따로따로 생성 함으로 변경되지 않음
	String loc;//인스턴스 변수만 맴버변수로 선언할 수 있다.
	long pay;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s=new Sawon();//할당 되지 않은 데이터를 메모리 할당 선언(4개)
		System.out.println("s="+s);
		s.sabun=10;
		s.name="홍길동";
		Sawon s2=s;
		System.out.println("s2="+s2);
		Sawon s1=new Sawon();//4개의 데이터를 또 메모리를 할당함
		System.out.println("s1="+s1);
		s1.sabun=20;
		s1.name="심청이";
		s2.name="춘향이";
		System.out.println("s.sabun : "+s.sabun);
		System.out.println("s.name : "+s.name);
	}

}
