package array;

public class ObjectCopy1 {

  public static void main(String[] args) {

    Book[] bookArray1 = new Book[3];
    Book[] bookArray2 = new Book[3];

    bookArray1[0] = new Book("태백산맥", "조정래");
    bookArray1[1] = new Book("데미안", "헤르만헤세");
    bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

  }

}
