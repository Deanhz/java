//map HashMap(无序)/TreeMap(有序)
package collection;
import java.util.*;

public  class collection_map{
    public static void main(String args[]){
        String[] words = {"if","it","is","to","be","it","is","up","to","me","delegate"};
        Integer freq;
        Map<String,Integer> m = new TreeMap<String,Integer>();
        for(String a:words){
            freq = m.get(a);
            if(freq == null){
                freq = 1;
            }else{
                freq = freq + 1;
            }
            m.put(a,freq);
        }
        System.out.println(m.size() + " distinct words detected:" + '\n' + m);
    }
}
