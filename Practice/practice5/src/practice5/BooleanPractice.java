package practice5;
/*
 * 22.06.03 
 * 5번째 자바연습입니다.
 * ~p69 2장완료
 */
public class BooleanPractice {

	public static void main(String[] args) {
		boolean isMarried = true;//boolean 변수를 선언하고 초기화
		System.out.println(isMarried);
		//논리자료형은 어떤 변수의 참, 거짓의 값을 나타내는데 사용하는데 종류는 boolean형 한가지 뿐이다. 1바이트값으로 참,거짓 두가지값만 가짐
		
		var i = 10;//int i = 10 으로 컴파일
		var j = 10.0;//double j = 10.0 으로 컴파일
		var str = "hello";//String str = "hello" 로 컴파일
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";//다른문자열은 대입가능
		//str = 3; str 변수는 String형으로 위에서 먼저 사용되었기 때문에 정수값3을 넣을 수 없음
		System.out.println(str);
		
		
	}

}
