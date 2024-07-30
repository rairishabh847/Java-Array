package ARRAY;

import java.util.*;

public class arraypattern {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array 1");
         int n1=sc.nextInt();
        int array1[]=new int [n1];
         
        for(int i=0;i<n1;i++){
            array1[i]=sc.nextInt();
        }
        printsubset(array1);
    }
    public static void printsubset(int arr[]){
        int tns=(int)Math.pow(2,arr.length);
        for(int i=0;i<tns;i++){
            int bn=dtob(i, 2);
            int div =(int)Math.max(10, arr.length-1);
            for(int j=0;j<arr.length;j++){
                int q=bn/div;
                int r=bn%div;
                if(q==1){
                    System.out.println(arr[j]+" ");

                }else{
                    System.out.println("-"+" ");
                }
                bn=r;
                div/=10;
            }
            System.out.println();
        }
    }

    public static int dtob(int d,int b){
        int c=0;
        int x=0;
        while(d!=0){
            int r=d%b;
            d=d/b;
            int power=(int)Math.pow(10,c);
            x+=r*power;
            c++;
         
        }

        return x;
    }
}
