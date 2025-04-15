package day1;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        
        // values are already known
        int scores[] = {34, 3, 33 ,41 };

        // values can be filled in later
        int tempretures[] = {40, 35, 38, 34};
        // tempretures[3] = 34;

        // System.out.println(scores[3]);

        for(int i=0;i<scores.length; i++){
            System.out.println(scores[i]);
        }

        
        for(int score: scores){
            System.out.println(score);
        }

        int totalTempreture = 0;
        for(int tempreture: tempretures){
            totalTempreture += tempreture;
            System.out.println(tempreture);
        }

        Arrays.sort(tempretures);
        System.out.println(tempretures[3]);

        System.out.println("Average is " + totalTempreture/tempretures.length);
    }
}
