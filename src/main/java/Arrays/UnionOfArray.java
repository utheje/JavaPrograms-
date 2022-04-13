package Arrays;

public class UnionOfArray {
    public static void main(String[] args) {

        Integer arr1[] = {1, 3, 4, 5, 7};
        Integer arr2[] = {2, 3, 5, 6};

        int i = 0,j = 0;
        while( i < arr1.length &&  j < arr2.length){

            if(arr1[i]<arr2[j]){
//                System.out.print(arr1[i++] + " ");
                i++;
            } else if(arr2[j]<arr1[i]){
//                System.out.print(arr2[j++] + " ");
                j++;
            }else
            {
                System.out.print(arr2[j++]+ " ");
                i++;
            }
        }

        while (i < arr1.length)
            System.out.print(arr1[i++] + " ");
        while (j < arr2.length)
            System.out.print(arr2[j++] + " ");

    }
}
