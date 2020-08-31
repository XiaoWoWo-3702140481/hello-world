package day.day01;

public class StrDemo01 {

    public static void main(String args[]) {

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println(str1==str2);
        System.out.println(str1==str3);

        //答案是true和false str1和str2拿的是字符串常量池的，str3由于一开始虚拟机不能解析变量值，在堆创建的



     }
}
