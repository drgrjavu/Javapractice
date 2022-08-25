package practice5;

public class 명시적_형_변환 {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; //1과 0으로 각각 int형으로 변환되어 더해져 1
		int iNum4 = (int)(dNum1 + fNum2); //1.2와 0.9가 더해진다음 2.1이 int형으로 변환되어 2
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int p1 = 10;
		double p2 = 2.2;
		System.out.println((int)(p1+p2));
		
	
	}

}
