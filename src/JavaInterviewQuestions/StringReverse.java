package JavaInterviewQuestions;

public class StringReverse {
    public static void main(String[] args) {

        reverseString("Cydeo");

    }

    public static void reverseString(String str){

        String reverseStr = " ";

        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);

        }
        System.out.println(reverseStr);

    }


}
