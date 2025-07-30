package string;
import java.util.Scanner;

public class BasicString {
    public static void main(String[] args) {
//        char ch = 'H';
//        System.out.println(ch);
//        //char array
//        char[] cha = {'M', 'A', 'H', 'I', 'M', 'A'};
//        System.out.println(cha);
//
//        //Object String
//        String str = new String("Harekrishna");
//        System.out.println(str);
//
//        Scanner sc = new Scanner(System.in);
//        String str2 = sc.nextLine();
//        System.out.println(str2);

//        String str = "Harekrishna";
//        int lengthOfstr = str.length();
//        System.out.println(lengthOfstr);

        //Concatenate
//        String firstName = "Harekrishna";
//        String lastName = "Mahima";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);

//        for(int i=0; i<fullName.length(); i++) {
//            System.out.print(fullName.charAt(i)+" ");
//        }

        //equality
//        String str1 = "Hare";
//        String str2 = "Hare";
//
//        String str3 = "hare";
//        String str4 = new String("Hare");
//        if(str1 == str2) {
//            System.out.println("Strings are equals");
//        } else {
//            System.out.println("Strings are not equals");
//        }
//
//        if(str1 == str3) {
//            System.out.println("Strings are equals");
//        } else {
//            System.out.println("Strings are not equals");
//        }
//
//        if(str1.equals(str4)) {
//            System.out.println("Strings are equals");
//        } else {
//            System.out.println("Strings are not equals");
//        }
//
//        if(str3 == str4) {
//            System.out.println("Strings are equals");
//        } else {
//            System.out.println("Strings are not equals");
//        }

        String name = "Harekrishna";
//        System.out.println(name.length());
        System.out.println(name.charAt(4));
        String name2 = "harekrishna";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
    }
}
