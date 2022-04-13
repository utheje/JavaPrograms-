package Arrays;

import java.util.Scanner;

public class avarageOfArray {
    public static void main(String args[]){
        int num=0,sum =0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        num = scan.nextInt();
        int[] a = new int[num];
        System.out.println("Enter the array elements");
        for (int i = 0;i<num;i++){
            a[i]=scan.nextInt();
        }

        for(int i : a){
            sum +=i;
        }
        System.out.println(sum +" _"+a.length);

        double average = sum/a.length;

        System.out.println(average);
    }
}
