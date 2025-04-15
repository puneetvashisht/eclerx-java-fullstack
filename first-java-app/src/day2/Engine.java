package day2;

public class Engine {
    int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }
    public void start(){
        System.out.println("Engine Starting...");
    }

    @Override
    public String toString() {
        return "Engine [horsePower=" + horsePower + "]";
    }
    
    
}
