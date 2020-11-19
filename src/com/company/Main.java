package com.company;

public class Main {

    public static void main(String[] args) {
        MyInteger m1 = new MyInteger(12);
        System.out.println(m1.equals(12));
        System.out.println(m1.equals(new MyInteger(12)));
        System.out.println(MyInteger.parseInt("213451"));
        System.out.println(MyInteger.parseInt("12415".toCharArray()));
        System.out.println(m1.isEven());
        System.out.println(m1.isOdd());
        System.out.println(m1.isPrime());
        m1 = new MyInteger(13);
        System.out.println("Changed value to 13.");
        System.out.println(m1.isEven());
        System.out.println(m1.isOdd());
        System.out.println(m1.isPrime());
    }
}
