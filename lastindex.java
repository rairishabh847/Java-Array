package ARRAY;

import java.util.Scanner;

public class lastindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Length of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Data=");
        int data=sc.nextInt();
        lastind(arr, data);
    }
    public static void lastind(int arr[],int data){
        int left=0;
        int right=arr.length-1;
        int li=-1;
        while (left<=right) {
            int mid =(left+right)/2;
            if(arr[mid]==data){
                li=mid;
                left=mid+1;
            }else if(arr[mid]<data){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println("Last index="+li);
    }
    
}
