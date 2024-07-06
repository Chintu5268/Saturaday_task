import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
  public static void main(String[] args) {
    List <Student> list = new ArrayList<>();
    list.add(new Student(101, "Ananat", "Amabani"));
    list.add(new Student(102, "Akash", "Amabani"));
    list.add(new Student(103, "Nita", "Amabani"));
    list.add(new Student(104, "Isha", "Amabani"));

    Collections.sort(list,Comparator.comparing(Student::getLastname));

    // print the first emement after the sorting 
    if(!list.isEmpty()){
      Student firStudent =list.get(1);
      System.out.println("Student name after the sorting");
      System.out.println("FirstName :"+firStudent.getFirstName());
      System.out.println("Lastname :"+firStudent.getLastname());
      System.out.println("Roll No :"+firStudent.getRollNo());
    }
  }

  
}
