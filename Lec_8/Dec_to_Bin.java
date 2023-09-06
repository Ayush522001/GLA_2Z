package Lec_9;

import java.util.Scanner;

public class Dec_to_Bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int ans=0;
        int multiplier=1;
        while (n!=0){
            int rem=n%2;
            ans=ans+(rem*multiplier);
            multiplier=multiplier*10;
            n=n/2;
        }
        System.out.println(ans);
    }
}
