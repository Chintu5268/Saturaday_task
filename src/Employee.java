public class Employee {
  private int id;
  private String EmpName;
  private double EmpSalary;
  public Employee(int id, String empName, double empSalary) {
    this.id = id;
    EmpName = empName;
    EmpSalary = empSalary;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getEmpName() {
    return EmpName;
  }
  public void setEmpName(String empName) {
    EmpName = empName;
  }
  public double getEmpSalary() {
    return EmpSalary;
  }
  public void setEmpSalary(double empSalary) {
    EmpSalary = empSalary;
  }
  
}
