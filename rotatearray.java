package ARRAY;

import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,4,5,6,7};
        System.out.print("enter no. k=");
       int k=sc.nextInt();
       rotate(arr,k);
       for(int i=0 ; i < arr.length;i++) {
        System.out.print(arr[i] + " ");
         }
    }
    public static void rotate(int [] arr,int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void reverse(int [] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }


    }
}
