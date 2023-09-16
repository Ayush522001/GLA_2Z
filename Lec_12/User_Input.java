package Lec_12;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int idx=0;idx< arr.length;idx++){
            arr[idx]= sc.nextInt();
        }
        System.out.println("=========>");
        for(int idx=0;idx<arr.length;idx++){
            System.out.print(arr[idx]+" ");
        }
    }
}
