import java.util.HashMap;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
    Map<Employee,Integer> employeeMap = new HashMap<>();
    
    Employee emp1 = new Employee(1, "Sandesh", 45700);
    Employee emp2 = new Employee(2, "Piyush", 42700);
    Employee emp3 = new Employee(3, "Rahul", 45200);

    employeeMap.put(emp3, 1000);
    employeeMap.put(emp2, 2000);
    employeeMap.put(emp1, 3000);


   int salary= employeeMap.get(emp3);
   System.out.println("Name of the Employee is " + emp3.getEmpName() +" Salary of "+ emp3.getEmpName() +" is "+salary);
  }
}
