package Lec_5;

import java.util.Scanner;

public class Pattern_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n=5;
        int row_no=1;
        int cspace=n-1;
        int cstar=1;

        while (row_no<=n){
            int space=1;
            while (space<=cspace){
                System.out.print("\t");
                space=space+1;
            }
            int star=1;
            int val=1;
            while (star<=cstar){
                System.out.print(val+"\t");
                if(star<(cstar/2+1)) {
                    val = val + 1;
                }
                else{
                    val=val-1;
                }
                star=star+1;
            }
            row_no=row_no+1;
            cspace=cspace-1;
            cstar=cstar+2;
            System.out.println();
        }
    }
}

