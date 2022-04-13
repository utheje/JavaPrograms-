package Arrays;

import java.util.Scanner;

public class maxMinOfArray {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        System.out.println("Enter the array elements");
        int a[] =new int[size];
        for(int i=0;i<size;i++){
            a[i] =scan.nextInt();
        }

        int max= a[0],min=a[0];
        for(int i =0 ;i<a.length;i++){
            if(a[i]<min)
                min =a[i];
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("The min "+ min +" The Max "+max);
    }
}

