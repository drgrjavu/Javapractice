package array;

public class ArrayTest {

  public static void main(String[] args) {
    int[] num = new int[] {1,2,3,4,5,6,7,8,10,9};
    for(int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
    int sum = 0;
    for(int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    System.out.println(sum);
  }


}


