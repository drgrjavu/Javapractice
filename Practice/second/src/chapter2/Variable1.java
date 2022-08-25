/*
 * Date : 2022/05/22
 * Author : 최종찬
 * Description : 두번째 자바 프로그램입니다.
 * Version : 1.7
 */
package chapter2;

public class Variable1 {

	public static void main(String[] args) {
		int level;
		//정수형 변수(int는 자료 level은 변수이름) level을 선언
		level = 10;
		//level 변수에 값 10을 대입한것 '여기서 = 은 같다가 아닌 오른쪽 값을 왼쪽에 대입한다임'
		System.out.println(level);
		//level 값을 출력
		//해석 : level이라는 이름의 변수를 정수 자료형으로 선언한다. 선언한 level 변수에 값 10을 대입한다.
		
		int status;
		status=100;
		System.out.println(status);
		//이건혼자서 안보고연습
		//해석 : status라는 이름의 변수를 정수 자료형으로 선언한다. 선언한 status 변수에 값 100을 대입한다.
		
		int age;
		age = 32;
		System.out.println(age);
		//복습
		
		int old = 123;
		System.out.println(old);
		//변수를 선언할때 값을 바로 대입함. 변수에 처음 값을 대입할는것을 '초기화'라고함
		
		//다음은 카멜표기법을 사용해보자
		int oLd = 245;
		System.out.println(oLd);
		/*ns와 numberOfstudunt 둘중에는 뒤에용어처럼 풀어쓰는게 용이하다. 또한 old와 oLd가 구별되는것처럼 나중에 변수이름이 많아질때와, 첫글자를 대문자를 쓰는 변수를
		 *사용할경우 구별시키기 편한 카멜표기법을 사용한다.(낙타의등과 같다하여)
		 */
		long asp =1512;
		System.out.println(asp);
		
		
	}

}
