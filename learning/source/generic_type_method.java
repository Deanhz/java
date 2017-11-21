//泛化方法
package generic_type;

class MyBox<T>{
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public <U> void inspect(U u){
        System.out.println("T:" + t.getClass().getName());
        System.out.println("U:" + u.getClass().getName());
        System.out.println();
    }
}

public class generic_type_method{
    public static void main(String agrs[]){
        MyBox<Integer> integerBox = new MyBox<Integer>();
        integerBox.add(new Integer(10));
        System.out.println("The first inspection:");
        integerBox.inspect("some text");
        System.out.println("The second inspection:");
        integerBox.inspect(new Double(100.0));

    }
}
