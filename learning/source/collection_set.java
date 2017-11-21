//Set
package collection;
import java.util.*;

public class collection_set{
    public static void main(String args[]){
        //HashSet,default length is 16
        Set<String> s = new HashSet<String>();

        for(String a : args){
            if(!s.add(a))
                System.out.println("Duplicate detected: " + a);       
        }
        System.out.println(s.size() + " distinct words detected: "+ s);

    }
}
