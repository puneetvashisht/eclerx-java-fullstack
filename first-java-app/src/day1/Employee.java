package day1;

public class Employee {
    
    // state 
    int id;
    String name;
    double salary;

    // constructor
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
     
        Employee e1 = new Employee(12, "Ravi", 34343.34);
        // e1.name = "Ravi";
        // e1.id = 34344;
    
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);

        Employee e2 = new Employee(1, "Priya", 35455.33);
        // e2.name = "Priya";
        System.out.println(e2.name);
    }
}
