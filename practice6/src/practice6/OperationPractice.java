package practice6;

public class OperationPractice {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 97;
		
		int totalScore = mathScore + engScore + korScore; //총점구하기
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0; //평균구하기
		System.out.println(avgScore);
		
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10);//&&논리곱 : 논리 곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i 값은 그대로임(둘다 참이어야하기때문에!)
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value= ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);//||논리합 : 논리 합에서 앞 항이 참이면 뒷 항이 실행되지 않아 i값은 그대로임(둘중에 하나가 참이어야하기때문에!)
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//중요!! 위 예제처럼 논리 곱 연산과 논리 합 연산을 할 때 두 항을 모두 실행하지 않더라도 결과 값을 알 수 있는 경우에, 나머지 항은 실행되지 않는 것을 단락회로평가!라고한다
		//단락회로평가(SCE : Short Circuit Evaluation)
		
	}

}
