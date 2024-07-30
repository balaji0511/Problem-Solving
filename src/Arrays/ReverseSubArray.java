package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSubArray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();

        System.out.println("Enter the value of K");
        int k=in.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the array Values");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int mod=n%k;
        int div=n/k;
        int low=0;
        int high=k;
        while(div>0){
            reverse(arr,low,high-1);
            low+=k;
            high+=k;
            div--;
        }
        reverse(arr,n-mod,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
