package day1;

public class ForDemo {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println("Even number : " + i);
            }
            else{
                System.out.println("Odd number : " + i);
            }
            if(i==50)
                break;
        }
    }
}
