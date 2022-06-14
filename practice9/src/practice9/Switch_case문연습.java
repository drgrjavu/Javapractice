package practice9;

public class Switch_case문연습 {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		switch(ranking) {
		case 1 : medalColor = 'G';
				 break;
		case 2 : medalColor = 'S';
				 break;
		case 3 : medalColor = 'B';
				 break;
		default :
				 medalColor = 'A';
		}
		System.out.println(ranking + "backcolor" + medalColor + "is");
		

	}

}
