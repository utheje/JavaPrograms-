package Arrays;

public class arraysumNearToZeo {

    public static void main(String[] args) {

        Integer[] arr = {1, 3, -5, 7, 8, 20, -40, 6};
        int min =0;
        int sum,k=0,m=0;

        min = arr[0]+arr[1];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                sum = arr[i]+arr[j];
                if(Math.abs(min)>Math.abs(sum)){
                    min = sum;
                    k = i;
                    m =j;
                }
            }

        }
        System.out.println(min+" "+ arr[k]+" "+arr[m]);


    }
}
