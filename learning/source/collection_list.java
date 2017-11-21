//List (ArrayList)
package collection;
import java.util.*;

public class collection_list{
    public static void main(String args[]){
        int numHands = Integer.parseInt(args[0]);
        int cardsPerhand = Integer.parseInt(args[1]);

        String[] suit = new String[]{"spades","hearts","diamonds","clubs"};
        String[] rank = new String[]{"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
        
        List<String> deck = new ArrayList<String>();
        for(String ss:suit){
            for(String sr:rank)
                deck.add(sr + " of " + ss);
        }
        Collections.shuffle(deck);

        for(int i=0;i<numHands;i++)
            System.out.println(dealHand(deck,cardsPerhand));
    }

    public static List dealHand(List<String> deck,int n){
        int deckSize = deck.size();
        //subList
        List<String> handView = deck.subList(deckSize-n,deckSize);
        List<String> hand = new ArrayList<String>(handView);
        handView.clear();
        return hand;
    }


}