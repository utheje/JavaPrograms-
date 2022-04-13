import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class third {
        public static void main(String[] args) {

            int[] nums = {3,2,3};
            int target = 6 ;
            int[] b = new int[2];

            for(int i =0 ;i< nums.length;i++)
            {
//                if (nums.length == 2){
//                   if(nums[0] + nums[1]  == target)
//                       b[1] = 1;
//
//                }
                for(int j =1 ;j<nums.length-1;j++){
                    if ( (nums[i] + nums[j] == target )) {
                        b[0] = i;
                        b[1] = j;
                    }
                }
            }
            for (int i =0 ;i< b.length;i++){
                System.out.println(b[i]);
            }

        }
    }


