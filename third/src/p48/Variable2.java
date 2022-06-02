/*
 * Date : 2022/05/23
 * Author : 최종찬
 * Description : 세번째 자바 프로그램입니다.
 * Version : 1.7
 */
package p48;

public class Variable2 {

	public static void main(String[] args) {
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
		//이경우 정수 값을 연산할 때 4바이트를 기본 단위로 사용하기 때문에, 두 정수를 더하기 전에 두 정수는 모두 int형으로 변환,더한 결과도 int형으로 저장 즉, 정수의 기본형은 int
		
		long num = 12345678900L;
		//뒤에 L이나 l을 식별자로 표시함으로서 long형으로 처리할수있음
		System.out.println(num);
		
		char myChar = 'A';
		//문자 자료형인 char형은 2바이트를 사용한다. 여기서'A'는 문자그대로가 아닌 그문자에 해당하는 정수값 즉, 아스키코드값으로서 저장됨
		System.out.println(myChar);
		
		
				
	}

}
