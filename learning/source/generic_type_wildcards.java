//泛型中的通配符
package generic_type;
import java.util.*;


class Cage<E> extends LinkedList<E>{
}

class Animal{
    public void feedMe(){};
}

class Lion extends Animal{
    public void feedMe(){
        System.out.println("Feeding lions");
    }
}

class ButterFly extends Animal{
    public void feedMe(){
        System.out.println("Feeding butterflies");
    }
}

public class generic_type_wildcards{
    public static void main(String args[]){
        generic_type_wildcards t = new generic_type_wildcards();
        Cage<Lion> lioncage = new Cage<Lion>();
        Cage<ButterFly> butterflycage = new Cage<ButterFly>();
        lioncage.add(new Lion());
        butterflycage.add(new ButterFly());
        t.feedAnimals(lioncage);
        t.feedAnimals(butterflycage);
    }
    void feedAnimals(Cage<? extends Animal> someCage){
        for(Animal a:someCage){
            a.feedMe();
        }
    }
}

