public class Student {
  private int rollNo;
  private String firstName;
  private String lastname;
  public Student(int rollNo, String firstName, String lastname) {
    this.rollNo = rollNo;
    this.firstName = firstName;
    this.lastname = lastname;
  }
  public int getRollNo() {
    return rollNo;
  }
  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  
}
