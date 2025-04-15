package day2;

// is-a Surgeon is a Doctor
// has-a Doctor has a Degree

class Degree{
    String name;
    public Degree(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Degree [name=" + name + "]";
    }
}

class Doctor{
    int yearsOfExperience;
    String specialization;
    Degree degree;

    

    public Doctor(int yearsOfExperience, String specialization, Degree degree) {
        this.yearsOfExperience = yearsOfExperience;
        this.specialization = specialization;
        this.degree = degree;
    }



    @Override
    public String toString() {
        return "Doctor [yearsOfExperience=" + yearsOfExperience + ", specialization=" + specialization + ", degree="
                + degree + "]";
    }



    public void consult(){
        System.out.println("Consulting ...");
    }
}

class Surgeon extends Doctor{
    int surgeriesPerDay;
    

    public Surgeon(int yearsOfExperience, String specialization, Degree degree, int surgeriesPerDay) {
        super(yearsOfExperience, specialization, degree);
        this.surgeriesPerDay = surgeriesPerDay;
    }



    @Override
    public String toString() {
        return "Surgeon [yearsOfExperience=" + yearsOfExperience + ", specialization=" + specialization + ", degree="
                + degree + ", surgeriesPerDay=" + surgeriesPerDay + "]";
    }



    public void performSurgery(){
        System.out.println("Performing surgery..");
    }
}


public class OopsDemo {
    public static void main(String[] args) {

        Degree degree = new Degree("MBBS");
        Surgeon heartSurgeon = new Surgeon(15, "Cardiac", degree, 1200);
        System.out.println(heartSurgeon);
        heartSurgeon.consult();
        heartSurgeon.performSurgery();
        
    }
}
