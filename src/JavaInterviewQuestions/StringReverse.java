package JavaInterviewQuestions;

public class StringReverse {

        public static void reverse(String str){

            String reverseString = "";

            for (int i = str.length()-1; i > -1; i--){
                reverseString += str.charAt(i);
            }

            System.out.println(reverseString);

        }

        public static void main(String[] args) {

            reverse("Irena");

        }
    }
/*
Write a program that reverse giving String
 */

