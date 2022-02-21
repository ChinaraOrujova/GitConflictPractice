package JavaInterviewQuestions;

public class StringReverse {
    public static void main(String[] args) {

        String name = "Team_Balboa";
        String str="";

        for (int i = name.length()-1; i >=0 ; i--) {
            str+=name.charAt(i);
        }
        System.out.println("Reverse number --> = " + str);


    }
}
