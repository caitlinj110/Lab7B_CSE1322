import java.util.Scanner;


public class Recursive {
    public static String repeatNTimes(String str, int n) {
        if (n == 0) {
            return "";
        } else {
            return str + repeatNTimes(str, n - 1);
        }
    }


    public static boolean isReverse(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else if (str1.length() == 0) {
            return true;
        } else {
            return str1.charAt(0) == str2.charAt(str2.length() - 1) &&
                    isReverse(str1.substring(1), str2.substring(0, str2.length() - 1));
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String repeatedString = repeatNTimes("I must study recursion until it makes sense\n", 100);
        System.out.println(repeatedString);

        // Prompt the user for two strings

        System.out.println("Enter string 1:");
        String s1 = sc.next();

        System.out.println("Enter string 2:");
        String s2 = sc.next();

        // Check if the strings are reverse of each other
        if (isReverse(s1, s2)) {
            System.out.println(s1 + " is the reverse of " + s2);
        } else {
            System.out.println(s1 + " is not the reverse of " + s2);
        }


    }
}

    }
}