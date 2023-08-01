public class Employee {
     int emp_id;
     String emp_name;
     int emp_sal;
     int working_days;
     int worked_days;


Employee( int id,String name,int sal,int working_days,int worked_days){
    this.emp_id=id;
    this.emp_name=name;
    this.emp_sal=sal;
    this.working_days=working_days;
    this.worked_days=worked_days;

System.out.println("Employee details");
}
         
public static void main(String[] args) {
    Employee a = new Employee( 101,"Swetha",50000,330,325);
    Employee b = new Employee(102,"Sumanth",55000,340,300);
    Employee c = new Employee(101,"Manisha",50500,330,310);
    
    
    System.out.println(a.emp_id);
    System.out.println(a.emp_name);
    System.out.println(a.emp_sal);
    System.out.println(a.worked_days);
    System.out.println(a);
  
}

}


