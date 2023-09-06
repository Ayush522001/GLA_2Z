package Lec_8;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int dividend=b;
        int divisor=a;
        int remainder=1;
        while (remainder!=0){
            remainder=dividend%divisor;
            dividend=divisor;
            divisor=remainder;
        }
        System.out.println(dividend);
    }
}
