package practice7;

public class 연산자 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F'; // 조건 연산자 조건식 ? 결과1 : 결과2 조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택됨
		
		System.out.println(ch);
		
		
		int num = 0B00000101; //5를 8비트 2진수로 표시함
		
		System.out.println(num << 2);//왼쪽으로 2비트 이동
		System.out.println(num >> 2);//오른쪽으로 2비트 이동
		System.out.println(num >>> 2);//오른쪽으로 2비트 이동
		
		System.out.println(num); // =(즉 대입)을 안해ㅆ기 때문에 num 값이 변하지 않았음
		
		num = num << 2;
		System.out.println(num);

	}

}
