package day1;

class Num{
    int value;
    public Num(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Num [value=" + value + "]";
    }    
}

public class ReferenceDemo {


    public static void changeValue(int x){
        x = x + 1;
    }
    public static void changeValue(Num x){
        x.value = x.value + 1;
    }

    public static void main(String[] args) {
        // int j = 34;
        Num j = new Num(34);
        changeValue(j);
        System.out.println(j);
    }
}
