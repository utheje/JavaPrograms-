import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class sequence {

    public static void main(String args[]){
        sequence sq = new sequence();
        sq.sequence1();
    }

        public void sequence1(){
            int[] a = {100,200,1,2,3,4};
            Arrays.sort(a);
            ArrayList<Integer> list = new ArrayList<>();
              list.add(a[0]);
            for(int i =0 ;i<a.length;i++){
                    if ((a[i+1]-a[i])==1){
                     list.add(a[i+1]);
                    }
                    else if ((a[i+1]-a[i])==0){
                        System.out.println("list alreay contains the element");
                    }else if ((a[i+1]-a[i])!=1){
                        break;
                    }

            }
            Iterator<Integer> itr = list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
}
