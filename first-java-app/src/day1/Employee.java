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

    // methods
    public void incrementSalary(int amount){
        if(amount>0 && amount<=10000){
            this.salary = this.salary + amount;
        }
        else if(amount > 10000){
            System.out.println("Voila! Great increment");
            this.salary = this.salary + amount;
        }
        else{
            System.out.println("Can't increment salary!");
        }
        
    }

    public String changeName(String newName){
        this.name = newName;
        // return 1;
        return this.name;
    }

    public String toString(){
        return "Name: " + this.name + " Salary: " + this.salary;
    }

    public static void main(String[] args) {
     
        Employee e1 = new Employee(12, "Ravi", 34343.34);
        // e1.name = "Ravi";
        // e1.id = 34344;
    
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);

        e1.incrementSalary(15000);
        e1.changeName("Ravikant");

        // System.out.println(e1.salary);
        // System.out.println(e1.name);
        System.out.println(e1.toString());

        Employee e2 = new Employee(1, "Priya", 35455.33);
        // e2.name = "Priya";
        System.out.println(e2.name);
    }
}
