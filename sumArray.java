package ARRAY;

import java.util.*;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array 1");
         int n1=sc.nextInt();
        int array1[]=new int [n1];
         
        for(int i=0;i<n1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("array 2");
        int n2=sc.nextInt(); 
        int array2[]=new int [n2];
        for(int i=0;i<n2;i++){
            array2[i]=sc.nextInt();
        }

        
        // int[] array1 = {9,9,9,8,4};
        //  int[] array2={9,9,9};
        sum(array1,array2);

    }
    public static void sum(int [] arr1,int [] arr2){
        int i=arr1.length-1;
        int j=arr2.length-1;
        int sz=Math.max(arr1.length, arr2.length)+1;
        int k=sz-1;
        int ans[]=new int[sz];
        int carry=0;
        while (k>=0) {
            
            int sum=carry;
             if(j>=0){
                sum+=arr2[j];
            }
            if(i>=0){
                sum+=arr1[i];
            }
            if(sum<10){
                carry=0;
            }else{
                carry=1;
                sum=sum-10;
            }
             ans[k]=sum;
            i--;
            j--;
            k--;
           

        }
        System.out.print("sum = ");
       for(int l=0;l<ans.length;l++){
        if(l==0 && ans[0]==0){
        }else{
            System.out.print(ans[l]);
        }
       }

    }
}
