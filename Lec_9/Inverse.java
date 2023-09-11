package Lec_9;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
//        System.out.println((int)Math.pow(10,2));

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int ans=0;
        int place=1;
        while (n!=0){
            int dig=n%10;
            ans+=(int)(Math.pow(10,dig-1)*place);
            n=n/10;
            place++;
        }
        System.out.println(ans);
    }
}
