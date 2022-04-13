package Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] a = {78,45,89,100,120,135};
        Arrays.sort(a);
        for(int i = 0 ;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        int search = 135;
        BinarySearch obj = new BinarySearch();
        System.out.println("The index of the requested search = " +obj.binarSearch(a,search));
    }

    public int  binarSearch(int[] arr,int search){

        int low = 0 , high = arr.length-1;
        while(low<=high){
            int mid = (low + high)/2 ;

            if(arr[mid] ==search){
                return mid;
            }else if(arr[mid]<search){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;

    }
}
