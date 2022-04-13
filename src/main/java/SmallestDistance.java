import java.util.Scanner;

public class SmallestDistance {

    public static int[] dataInput(){

        Scanner scan = new Scanner(System.in);

        // Accept the array size
        System.out.println("Enter the array size ");
        int arraySize = scan.nextInt();
        if (arraySize < 1){
            System.out.println("Please enter a valid arraySize");
        }
        int a[] = new int[arraySize];

        // Accept the array elements
        System.out.println("Enter the array elements");
        for (int i =0 ;i< arraySize;i++) {
            a[i] = scan.nextInt();
        }

        return a;
    }

    public static int abs(int x)
    {
        if(x<0)
            x=x*-1;
        return x;
    }

    public static int minimimDistance(int[] a){
        int minDist,index = 0;
        if (a.length <=1)
        {
            return 0;
        }

        int diff = abs(a[0] - a[1]);

        for (int i = 1; i < a.length - 1; i++) {
            minDist = abs(a[i] - a[i + 1]);
            if (minDist < diff) {
                diff = minDist;
                index = i;
            }
        }
        return index;
    }

    public static void main(String args []){

        // accept input from the user
        int arr[] = dataInput();
        // Find the minimum dist and store to integrer variable
        int index= minimimDistance(arr);
        System.out.println("The index of minimum distance between two numbers is "+ index);


    }
}
