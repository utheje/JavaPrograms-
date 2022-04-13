import java.util.Scanner;

public class ArrayFunction {


    static Scanner sc = new Scanner(System.in);
    static int size = sc.nextInt();
    static int[] array = new int[size];

    public void datatoarray(int[] array)
    {

        System.out.println("Enter data in the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

    }

    public static int findthedistancebetweennumber(int[] arr) {

        int min_diff = 0;
        int index = 0;

        int diff1 = Math.abs(arr[0] - arr[1]);

        for (int i = 1; i < arr.length - 1; i++) {

            min_diff = Math.abs(arr[i] - arr[i + 1]);

            if (min_diff < diff1) {
                diff1 = min_diff;
                index = i;
            }

        }

        System.out.println("The minimum difference is " + diff1);

        return index;

    }

    public static void main(String[] args)
    {

        int index= ArrayFunction.findthedistancebetweennumber(array);

        System.out.println("And the index is "+ index);

    }
}
