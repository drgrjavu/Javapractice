package staticex;

public class Student3 {
  private static int serialNum = 1000;
  private static int cardNum = 100;
  public int studentID;
  public int studentCard;
  public String studentName;
  public int grade;
  public String address;

  public Student3() {
    serialNum++;
    studentID = serialNum;
    studentCard = studentID + cardNum;
    cardNum += 100;

  }
  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String name) {
    studentName = name;
  }

  public static int getSerialNum() {
    return serialNum;
  }
  public static void setSerialNum(int serialNum) {
    Student3.serialNum = serialNum;
  }
  public static int getCardNum() {
    return cardNum;
  }
  public static void setCardNum(int cardNum) {
    Student3.cardNum = cardNum;
  }



}
