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
    System.out.println("Employee Salary : "+salary);

}
public static void main(String[] args) {
    Employee emp1=new Employee("xyz",101,55000.0);
    Employee emp=new Employee("abc",102,65000.0);

    emp1.displayinfo();
    emp.displayinfo();

}
}
