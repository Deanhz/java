//泛化类
package generic_type;

class MyBox<T>{
	private T t;
	public void add(T t){
		this.t = t;
	}
	public T get(){
		return t;
	}
}

public class generic_type_class{
	public static void main(String args[]){
		MyBox<Integer> aBox = new MyBox<Integer>();
		aBox.add(new Integer(1000));
		Integer i = aBox.get();
		System.out.println("This integer is:" + i );
	}
}
