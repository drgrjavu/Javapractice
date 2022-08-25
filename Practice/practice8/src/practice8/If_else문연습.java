package practice8;

public class If_else문연습 {

	public static void main(String[] args) {
		int age = 9;
		int charge;
		if (age < 8) {
			charge = 1000;
			System.out.println("yuchiwon");
			}
		else if(age < 14) {
			charge = 2000;
			System.out.println("choding");
			}
		else if(age < 20) {
			charge = 2500;
			System.out.println("jungoding");
			}
		else {
			charge = 3000;
			System.out.println("adult");
			}
		System.out.println("EntryCharge is " + charge + "WON");
		

	}

}
