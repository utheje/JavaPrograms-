package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

class rotateArray {
    /*Function to left rotate arr[] of size n by d*/
   public static void main(String args[]){

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int num,temp,rotate;
       num = scan.nextInt();
       int a[] = new int[num];
       System.out.println("Enter the array elements");
       for(int i=0;i< num;i++){
           a[i]= scan.nextInt();
       }
       //Rotate any array
       System.out.println("Enter the number the times array to be rotated");
       rotate =scan.nextInt();
       for(int i =0 ;i<rotate ;i++)
       {
           temp =a[0];
           for(int j=0;j<a.length-1;j++){

               a[j] =a[j+1];

           }
           a[a.length-1] = temp;
       }
       for(int i =0 ;i< a.length;i++){
           System.out.print(a[i] + " ");
       }
   }
}
