package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sumArray {

    public static void main(String args[]){

        int num = 0 ;
        int sum = 0 ;
        int[] a = new int[num];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");

        num = scan.nextInt();
        // accept input elements to the array
        System.out.println("Enter the array elements");
        for (int i =0; i< num ;i++){
           a[i] = scan.nextInt();
        }

        for(int i :a)
        {
            sum += i;
        }
        System.out.println("The sum of array is "+sum);
    }
}
