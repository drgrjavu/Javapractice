package practice7;

public class 총정리문제3장 {

	public static void main(String[] args) {
		//p88
				//문제1
				int myAge = 23;
				int teacherAge = 38;
				
				boolean value = (myAge > 25);
				System.out.println(value);//false
				
				System.out.println(myAge <= 25);//true
				System.out.println(myAge == teacherAge);//false
				
				char ch;
				ch = (myAge > teacherAge) ? 'T' : 'F'; //F
				System.out.println(ch);

				//문제2
				int num;
				num = -5 + 3 * 10 / 2; //10
				System.out.println(num);
				
				//문제3
				System.out.println(num);
				System.out.println(num++);
				System.out.println(num);
				System.out.println(--num);
				
				//문제4
				int num1 = 10;
				int num2 = 20;
				boolean result;
				result = ((num1 > 10) && (num2 > 10)); //f
				System.out.println(result);//f
				result = ((num1 >10) || (num2 > 10)); //t
				System.out.println(result); //t
				System.out.println(!result);//f
				
				//문제5
				int num3 = 2;
				int num4 = 10;
				System.out.println(num3 & num4);
				System.out.println(num3 | num4);
				System.out.println(num3 ^ num4);
				System.out.println(~num3);
				
				//문제6
				int num5 = 8;
				System.out.println(num5 += 10); //18
				System.out.println(num5 -= 10); //18(위에 num5 + 10 대입완료) - 10 = 8
				System.out.println(num5 >>= 2); 
				
				//문제7
				int num6 = 10;
				int num7 = 20;
				
				int result1 = (num6 >= 10) ? num7 +10 : num7 - 10; //30
				System.out.println(result1);

	}

}
