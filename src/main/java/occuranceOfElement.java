import com.sun.javafx.collections.MappingChange;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class occuranceOfElement {

    public static void main(String args[]) {
        Integer[] a = {1, 3, 1, 2, 2, 2, 600, 2, 5, 6, 7, 8, 100, 80};
        int c = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
       for(int i =0 ;i<a.length;i++){
           if(map.containsKey(a[i])){
               c = map.get(a[i]);
               map.put(a[i],c+1);
           }else{
               map.put(a[i],1);
           }
       }
        System.out.println(map);

       Iterator<Integer> itr = map.keySet().iterator();
       while(itr.hasNext()){
           int key = itr.next();
           System.out.println(key +" :: "+map.get(key));
       }
    }
}
