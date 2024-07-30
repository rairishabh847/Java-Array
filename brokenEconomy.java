package ARRAY;

import java.util.Scanner;

public class brokenEconomy {
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
        broEco(arr, data);
    
    }
    public static void broEco(int arr[],int data){
        int floar=-1;
        int ciel=-1;
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid =(left+right)/2;
            if(arr[mid]==data){
                floar=arr[mid];
                ciel=arr[mid];
                break;
            }
            if(arr[mid]<data){
                floar=arr[mid];
                left=mid+1;
            }else{
                ciel=arr[mid];
                right=mid-1;
            }
        } 
        System.out.println("floar="+floar+"\n"+"ciel="+ciel);
    }
}
