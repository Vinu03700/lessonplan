public class Employee {
    String name;
int id;
double salary;
        String adress;
    
public Employee (String name,int id,double salary)
{
    this.name=name;
    this.id=id;
    this.salary=salary;
       this.adress=adress;

}
public void displayinfo(){
    System.out.println("Employee Id : "+id);
    System.out.println("Employee Name : "+name);
    System.out.println("Employee Salary : no"+salary);
    System.out.println("Employee adress:" +adress);

}
public static void main(String[] args) {
    Employee emp1=new Employee("xyz",101,55000.0,"Hubbali");

    Employee emp1=new Employee("xyz",101,55000.0);
    emp1.displayinfo();

}
} 
