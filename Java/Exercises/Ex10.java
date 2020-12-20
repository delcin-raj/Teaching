class A1 {
    int x;
    String s = "Class A";
}

class B extends A1 {
    String s = "Class B";

    {
        System.out.println(super.s);
    }
    static {
        System.out.println("wtf bullshit");
    }
    static {
        System.out.println("wtf bullshit 2");
    }

}

class C extends B {
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class Ex10 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.s);
    }
}