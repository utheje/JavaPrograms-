package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class countFreqOfChar {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        countFreqOfChar freq =  new countFreqOfChar();
        freq.countFreq(original);
    }

    public void countFreq(String original){
        Map<Character,Integer> map = new HashMap<>();
        original = original.replaceAll(" ","");
        char[] ch =original.toLowerCase().toCharArray();
        int count;
        for(int i =0; i< ch.length;i++){
            if(map.containsKey(ch[i])){
                count =  map.get(ch[i]);
                map.put(ch[i],count+1);
            }
            else{
                map.put(ch[i],1);
            }
        }
        System.out.println(map);

        Iterator<Character> itr =  map.keySet().iterator();
        while(itr.hasNext()){
            Character key  = itr.next();
            System.out.println("Character "+key+" is repeted "+ map.get(key)+" times");
        }

    }
}
