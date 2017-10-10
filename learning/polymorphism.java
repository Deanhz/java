class A {
    public String show(D obj){
        return ("A and D");
    }

    public String show(A obj){
        return ("A and A");
    }
    public String show(){
        return "AAAA";
    }
}

class B extends A {
    public String show(B obj){
        return "B and B";
    }

    public String show(A obj){
        return "B and A";
    }
    public String show(){
        return "BBBB";
    }
}

class C extends B {

}

class D extends B {

}

public class polymorphism{
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println(a1.show());
        System.out.println(a2.show());
        System.out.println(a3.show());
        System.out.println("1--" + a1.show(b));// A and A
        System.out.println("1.2--" + a2.show(b));// B and A !!!
        System.out.println("1.3--" + a3.show(b));// B and A !!!
        System.out.println("1.4--" + a3.show(d));// A and D
        System.out.println();
        System.out.println("2--" + a1.show(c));// A and A
        System.out.println("3--" + a1.show(d));// A and D
        System.out.println();
        System.out.println("4--" + a2.show(b)); //B and A !!!
        System.out.println("5--" + a2.show(c)); //B and A !!!
        System.out.println("5.1--" + a2.show(a1)); //B and A 
        System.out.println("6--" + a2.show(d)); //A and D
        System.out.println("7--" + b.show(b));  //B and B
        System.out.println("8--" + b.show(c));  //B and B
        System.out.println("9--" + b.show(d));  //A and D
    }
}

//在继承链中对象方法的调用存在一个优先级：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
//a3.show(d),a3是A引用，C实例。由于C中没有show(D d)方法,所以super.show() 查找C的父类B，由于B也没有，故查找到A类，调用A的show(D d)方法。
//a2.show(b),a2是A引用，B实例。由于B中已经存在show(B b)方法，但是该方法不能执行，因为这属于多态，而多态要求B的父类A中必须有show(B b)方法才能执行，
//所以this.show((super)b)，调用B.show(B b)。a3.show(b)，同理，由于C中没有show(B b),查找到C的父类，B中存在show(B b),再按上面所述进行。
//a2.show(c)同理。






