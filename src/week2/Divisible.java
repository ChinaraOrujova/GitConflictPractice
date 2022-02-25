package week2;

import java.util.ArrayList;

public class Divisible {
    public static void main(String[] args) {
        divisibleBy();
    }

    public static void divisibleBy(){
        ArrayList<Integer>dby15=new ArrayList<>();
        ArrayList<Integer>dby3=new ArrayList<>();
        ArrayList<Integer>dby5=new ArrayList<>();

        for(int i=1;i<=100;i++){
            if (i % 15 == 0) {
                dby15.add(i);
                if (i % 5 == 0) {
                    dby5.add(i);
                } else if (i % 3 == 0) {
                    dby3.add(i);
                }
                System.out.println("Number divisible by 15:"+dby15);
                System.out.println("Numebr divisible by 5"+dby5);
                System.out.println("Number divisible by 3"+dby3);


            }
        }
    }
}
