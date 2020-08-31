package day.day01;

public class StrDemo02 {

    public static void main(String args[]) {

        String str1 = "ab";
        String str2 = "c";
        String str3 = "ab" + "c";
        String str4 = str1 + str2;

        String str5 = "ab" + str2;

        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str4 == str5);

        String str6 = "ab" + new String("c");

        System.out.println(str3 == str6);
        System.out.println(str5 == str6);

        String str7 = "ab" + new String("c");
        String str8 = str1 + str2;

        System.out.println(str7 == str6);
        System.out.println(str4 == str8);

        

     }
}
