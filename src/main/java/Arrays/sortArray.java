package Arrays;

import java.util.Arrays;

public class sortArray {

    public static void main(String args[]){

        int a[] = {1,1,3,5,2,2,2,3,4,5,6,7,8};
        int n = a.length;

        if( n == 0 || n ==1)
        {
            System.out.println(a[n]);
        }
//        Arrays.sort(a);
         int temp =0;
        for (int i =0 ;i< a.length;i++)
        {
            for (int j = i+1 ;j< a.length-1 ;j++)
            {
                if (a[i] > a[j])
                {
                    temp =a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }

        for(int i =0 ;i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public void array(){
        int a[] = new int[5];
        int b[][] = new int [3][5];
        int c[][][] = new int [4][5][6];

    }

}
