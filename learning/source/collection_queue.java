//Queue LinkedList
package collection;
import java.util.*;

public class collection_queue{
    public static void main(String args[]){
        int time = 5;
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=time;i>=0;i--)
            q.add(i);
        while(!q.isEmpty()){
            System.out.println(q.remove());
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}