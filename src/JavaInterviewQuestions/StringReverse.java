package JavaInterviewQuestions;

public class StringReverse {

    public static void reverseString(String str){
        String newStringReversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStringReversed += str.charAt(i);

        }
    }
}
