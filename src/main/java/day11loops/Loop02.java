package day11loops;

public class Loop02 {
    public static void main(String[] args) {

        // Example: Put * between two consecutive characters and at the end of the String
        // Java => J*a*v*a*
        // NOTE: When we work with Strings, we use index

        String str = "Java";

        // System.out.print(str.charAt(0) + "*");
        // System.out.print(str.charAt(1) + "*");

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();
        System.out.println("======= Task 2 ==========");

        // Example: Print all the words before 'm' in the given String.
        // "wisdom" => "wisdo"  "Tram" => "Tra"   "Miami" => "Mia"

        String str1 = "Miami";

        // 1sy way: without loops
        System.out.println(str1.split("m")[0]);


        // with loops
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'm') {
                break;  // break keyword can be used in the loops to break the loop at any point
            }
            System.out.print(ch);
        }


        System.out.println();
        System.out.println("======= Task 3 ==========");
        // Example:  Print all the letters from a given String except lowercase
        // "Pwd123?AB" => P123?AB

        String str2 = "Pwd123?AB";

        // 1st way :
        for (int i = 0; i < str2.length(); i++) {

            if (! (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')) {
                System.out.print(str2.charAt(i));
            }
        }

        System.out.println();
        // 2nd way:

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue; // is used to skip the data when the condition is met
            }
            System.out.print(ch);
        }

        System.out.println();
        System.out.println("======= INTERVIEW QUESTION ==========");
        // INTERVIEW QUESTION
        // Reverse the given String
        String s = "java";  // => avaj

        String reversed = "";

        for (int i = s.length()-1;  i>=0; i--){

              reversed = reversed + s.charAt(i);

        }

        System.out.println(reversed);


        System.out.println("======= 2nd INTERVIEW QUESTION ==========");
        // Check if the given String is Palindrome or not
        // ana => ana
        // mom => mom

        String s1 = "ana";
        String reversedStr = "";

        for (int i = s1.length()-1; i>=0; i--){

             reversedStr = reversedStr + s1.charAt(i);
        }
        System.out.println("reversedStr = " + reversedStr);
        // To check if it is a Palindrome or not

        if (reversedStr.equals(s1)){
            System.out.println("This is a Palindrome");
        }else {
            System.out.println("This is not a Palindrome");
        }





    }

}
