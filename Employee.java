public class Employee {
    String name;
int id;
double salary;
public Employee (String name,int id,double salary)
{
    this.name=name;
    this.id=id;
    this.salary=salary;

}
public void displayinfo(){
    System.out.println("Employee Id : "+id);
    System.out.println("Employee Name : "+name);
    System.out.println("Employee Salary : no"+salary);
    System.out.println("Employee number:99049489");

}
public static void main(String[] args) {
    Employee emp1=new Employee("xyz",101,55000.0);

    emp1.displayinfo();

}
} 
