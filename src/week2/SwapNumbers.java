package week2;

public class SwapNumbers {

    public static void swapNumbers(int a, int b){
        System.out.println("a before swapping is:"+a);
        System.out.println("b before swapping is:"+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a is:"+a);
        System.out.println("b is:"+b);

        /*
        Numbers--Swap Numbers
        Swap 2 variable' values without using third variable.
         */
    }

    public static void main(String[] args) {
        swapNumbers(5,10);
    }
}
