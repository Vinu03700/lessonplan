public class Employee {
    String name;
    int id;
     double salary;
     String name1;
      
    
public Employee (String name,int id,double salary,  String name1 )
{
    this.name=name;
    this.id=id;
    this.salary=salary;
     this.name1=name1;
    

}
public void displayinfo(){
    System.out.println("Employee Id : "+id);
    System.out.println("Employee Name : "+name);
    System.out.println("Employee Salary : no"+salary);
        System.out.println("Employee name1 : no"+name1);
    

}
public static void main(String[] args) {
    Employee emp1=new Employee("xyz",101,55000.0."hi");
    emp1.displayinfo();

}
} 

    emp1.displayinfo();

}
} 
