package ARRAY;

import java.util.Scanner;

public class trappingRain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr={2,3,1,8,2,4,5};

        System.out.println("Water Trapped ="+waterTrapped(arr));
    }
    public static int waterTrapped(int [] arr){
        int n=arr.length;
        int [] leftMax=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        
        int [] rightMax=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }

        // trapp 
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(leftMax[i],rightMax[i])-arr[i];

            
        }
        return sum;
       
    }
}
