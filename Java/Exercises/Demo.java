class A {
    int a; // Object variable, will be stored in the block of respective object
    static String classVariable = "static A";

    public A(int a) {
        this.a = a;
    }

    int g() {
        return this.a;
    }
}

public class Demo {
    public static void main(String[] args) {
        A x = new A(5);
        System.out.println("value of x" + x.g()); // => g(x)
        A y = new A(7);
        System.out.println("value of y" + y.g());
    }
}
