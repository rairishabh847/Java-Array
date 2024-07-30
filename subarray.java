package ARRAY;

import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array 1");
         int n1=sc.nextInt();
        int array1[]=new int [n1];
         
        for(int i=0;i<n1;i++){
            array1[i]=sc.nextInt();
        }

        System.out.println(" sub array");

        for(int si=0;si<array1.length;si++){
            for(int ei=si;ei<array1.length;ei++){
            for(int j=si;j<=ei;j++){
                System.out.print(array1[j]);
            }
            System.out.println();
        }
        }
    }
    
}
