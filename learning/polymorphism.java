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
        System.out.println("1.2--" + a2.show(b));// B and A
        System.out.println("1.3--" + a3.show(b));// B and A
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

