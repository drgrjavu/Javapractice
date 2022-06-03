package practice5;

public class ConstantPractice {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100; //상수로 MAX_NUM에 선언과 동시에 100을 대입 초기화
		final int MIN_NUM;
		
		MIN_NUM = 0;//위에 상수 MIN_NUM 선언하고 사용하기전에 0을 대입하여 초기화
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;위에서 상수로 선언하였기 때문에 값을 변경할수없음
		

	}

}
