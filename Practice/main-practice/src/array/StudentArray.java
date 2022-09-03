package array;

public class StudentArray {

  public static void main(String[] args) {

    Student[] students = new Student[3];
    students[0] = new Student(1111, "tomas");
    students[1] = new Student(1212, "james");
    students[2] = new Student(3333, "edward");
    for(int i = 0; i < students.length; i++) {
      students[i].showStudentInfo();

    }


  }

}
