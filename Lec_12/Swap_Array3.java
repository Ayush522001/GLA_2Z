package Lec_12;

public class Swap_Array3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arr[0]+"  "+arr[1]);
        swap(arr,0,1);
        System.out.println(arr[0]+"  "+arr[1]);

    }
    public static void swap(int arr[],int i,int j){
        int c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }
}
