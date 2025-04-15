package day2;

public class Employee {
    
    // state 
    int id;
    String name;
    double salary;
    Address address;


    // constructor
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(int id, String name, double salary, Address address){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
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

   

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
    }
    public static void main(String[] args) {
     
        Address address = new Address(233, "Hinjewadi");

        Employee e1 = new Employee(12, "Ravi", 34343.34, address);    
        Employee e2 = new Employee(1, "Priya", 35455.33, address);


        // Employee employees[] = {e1, e2};
        Employee employees[] = new Employee[2];
        employees[0] = e1;
        employees[1] = e2;


        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
