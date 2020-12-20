class Base1 {
    void f() {
        System.out.println("Base");
    }

    public static void show() {
        System.out.println("Base::show() called");
    }
}

class Derived1 extends Base1 {

    public static void show() {
        System.out.println("Derived::show() called");
    }

    void f() {
        System.out.println("Derived");
    }

}

class Main {
    public static void main(String[] args) {
        Derived1 b = new Derived1();
        b.f();
        b.show();
    }
}