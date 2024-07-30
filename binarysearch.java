package ARRAY;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int arr [] = {5,12,15,20,25,32,40,50,60};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+", ");
        // }
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
           
        }

        System.out.print("Enter Data=");
        int data=sc.nextInt();
        System.out.println(binary(arr, data));
        
    }
    public static int binary(int arr[],int data){
            int left=0;
            int right=arr.length-1;
            while(left<=right){
                int mid =(left+right)/2;
                if(arr[mid]==data){
                    return mid;
                }
                if(arr[mid]<data){
                    left=mid+1;
                }else{
                    right=mid-1;
                    
                }
            }
            return -1;
        }
    
}
