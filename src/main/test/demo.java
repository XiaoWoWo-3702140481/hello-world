package test;

import entity.student;

import java.util.concurrent.atomic.AtomicInteger;

public class demo {

    public static void main(String args[]) {
      System.out.println("aa");

      String aa ="aaaa";
      aa.toString();
      System.out.println(aa);

      student  stu = new student();
        AtomicInteger age = new AtomicInteger();
        age.getAndSet(111);
        stu.setAge(age);
        System.out.println(stu.getAge());


    }
}
