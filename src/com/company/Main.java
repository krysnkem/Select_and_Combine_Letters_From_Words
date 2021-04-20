package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 9;
        System.out.println("The factorial of "+ value + " is "+ factorial(value));

    }
    public static int factorial(int x){
        int n = x;
        int m = x;

        while(m > 1){
            n *= (m-1);
            --m;
        }
        return n;
    }

}
