package practice9;

public class ifelse연습 {

  public static void main(String[] args) {
    int score = 88;
    char grade;

    if(score >= 90) {
      grade = 'A';
    }
    else if(score >=80) {
      grade = 'B';
    }
    else if(score >=70) {
      grade = 'C';
    }
    else if(score >=60) {
      grade = 'D';
    }
    else {
      grade = 'F';
    }

    System.out.println(grade);


    /*조건문을 조건연산자로 표현가능하다
     *if - else문
     *if(score >=90){
     *grade = 'A';
     *}
     *else{
     *grade = 'B';
     *}
     *라고 할때 조건연산자로 표현하면 grade = (score >= 90) ? 'A' : 'B' 가된다. 조건문이 90이상이 참이게되면 A 거짓이면 B 의 결과를 grade에 대입한다
     */
    //s

  }

}
