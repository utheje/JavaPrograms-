package Arrays;

public class tripletsOfGivenArray {

    public static void main(String[] args) {

        int[] a = {2, 3, 5, 1, 4, 9};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length - 1; j++) {

                for (int k = j + 1; k < a.length; k++) {

                    if (a[i] + a[j] + a[k] > sum && a[i] < a[j] && a[j] < a[k]) {

                        sum = a[i] + a[j] + a[k];
                        System.out.println(a[i] + " " + a[j] + " " + a[k] + " Sum of all trriplets =" + sum);
                    }
                }


            }
        }
    }
}
