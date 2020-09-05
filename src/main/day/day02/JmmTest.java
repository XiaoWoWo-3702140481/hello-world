package day.day02;

public class JmmTest extends Thread {
   // private volatile boolean flag = false;//加了volatile相当于静态的线程安全的，所有对象都是能得到
   private boolean flag = false;

    public void run() {
        while (!flag);
        System.out.println("我停了"+ System.currentTimeMillis());
    }
    public static void main(String[] args) throws Exception {
        JmmTest vt = new JmmTest();
        vt.start();
        Thread.sleep(2000);
        vt.flag = true;
    }
}