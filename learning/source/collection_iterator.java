//Iterator (ListIterator)
package collection;
import java.util.*;

public class collection_iterator{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            list.add(new Integer(i));
        }
        System.out.println("The original list: "+ list);

        ListIterator<Integer> listIter = list.listIterator();
        listIter.add(0);
        System.out.println("After add at beginning:" + list);

        if(listIter.hasNext()){
            int i = listIter.nextIndex();
            listIter.next();
            listIter.set(new Integer(9));
            System.out.println("After set at "+ i +":" + list);
        }
        if(listIter.hasNext()){
            int i =listIter.nextIndex();
            listIter.next();
            listIter.remove();
            System.out.println("After remove at "+ i + ":" + list);
        }
    }
}