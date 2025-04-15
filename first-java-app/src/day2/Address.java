package day2;

public class Address {
    
    int houseNumber;
    String locality;

    public Address(int houseNumber, String locality) {
        this.houseNumber = houseNumber;
        this.locality = locality;
    }

    // public Address(int houseNumber, String locality){
    //     this.houseNumber = houseNumber;
    //     this.locality = locality;
    // }

    

    public static void main(String[] args) {
        Address add1 = new Address(234, "GK");
        // System.out.println(add1.houseNumber);
        System.out.println(add1);
    }

    @Override
    public String toString() {
        return "Address [houseNumber=" + houseNumber + ", locality=" + locality + "]";
    }

   

}
