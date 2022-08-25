/*
 * 6/02 4번째 자바연습입니다.
 * p-54~
 */
package practice4;

public class CharPractice {

	public static void main(String[] args) {
		char ch1;
		ch1 = '한';
		char ch2 = '한';
		char ch3 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		//체크할것!! 한글 콘솔에 깨짐현상 해결하기 (현재까지 window-preference 에서 utf-8 디폴트인코딩후 적용해보았지만 해결안됨
		//오히려 utf-16으로 바꿨다가 utf-8로 돌아오니 깨짐
		//다시됬는데 여전히 한글만 안나옴 깨짐이 아니라 그냥안나옴
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66; 문자자료형은 정수값으로 표현되기에 정수자료형으로 분류하는경우도 있지만 정수자료형과 차이첨음 char형은 음수 값을 표현할수없다. 따라서 주석처리함
		
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		//System.out.println(b2);오류 주석처리
		//콘솔에서 system.out.println char b란을 보면 ?로 처리되어있는데 이는 알수없는 문자라는 뜻
		
		double dnum = 3.14;
		float fnum = 3.14F;
		//float에서 F는 식별자(float형 값이 대입된다는 의미의 f나F를 숫자뒤에 붙여서 식별해줘야댐) 
		System.out.println(dnum);
		System.out.println(fnum);
		
		//p58 예문 그냥 따라쳐보기
		double cnum = 1;
		for(int i = 0; i < 10000; i++) {
			cnum = cnum + 0.1;
		}
		System.out.println(cnum);
		
		}
		
		
	}

