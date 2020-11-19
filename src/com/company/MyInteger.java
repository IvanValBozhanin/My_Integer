package com.company;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isOdd(){
        return (value&1) != 0;
    }
    public boolean isEven(){
        return (value&1) == 0;
    }

    public boolean isPrime(){
        for(int i=2;i*i<=value; ++i){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int n){
        return (n&1) != 0;
    }

    public static boolean isEven(int n){
        return (n&1) == 0;
    }

    public static boolean isPrime(int n){
        for(int i=2;i*i <= n; ++i){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(MyInteger n){
        return (n.getValue()&1) != 0;
    }

    public static boolean isEven(MyInteger n){
        return (n.getValue()&1) == 0;
    }

    public static boolean isPrime(MyInteger n){
        for(int i=2;i*i <= n.getValue(); ++i){
            if(n.getValue() % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean equals(int n){
        return n == value;
    }

    public boolean equals(MyInteger n){
        return n.getValue() == value;
    }

    public static int parseInt(char[] c){
        for (char ch :
                c) {
            if (ch > '9' || ch < '0') {
                throw new IllegalArgumentException("Char array cannot include non-digits!");
            }
        }
        if(c.length > 10){
            throw new IllegalArgumentException("Number will be bigger than Integer!");
        }
        long n=0;
        for (char ch :
                c) {
            n+=(ch-'0');
            n*=10;
        }
        if(n>Integer.MAX_VALUE){
            throw new IllegalArgumentException("Number will be bigger than Integer!");
        }
        return ((int)n)/10;
    }

    public static int parseInt(String s){
        if(s.length() > 10){
            throw new IllegalArgumentException("Number will be bigger than Integer!");
        }
        long n=0;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i) > '9' || s.charAt(i)<'0'){
                throw new IllegalArgumentException("String cannot include non-digits!");
            }
            n+=(s.charAt(i) - '0');
            n*=10;
        }
        if(n>Integer.MAX_VALUE){
            throw new IllegalArgumentException("Number will be bigger than Integer!");
        }
        return ((int)n)/10;
    }

    public int getValue() {
        return value;
    }
}
