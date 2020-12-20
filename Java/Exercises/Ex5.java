// Liskov Substituition:
// Subtype Requirement: Let f(x) be a property provable 
// about objects x of type T. Then f(y) 
// should be true for objects y of type S where S is a subtype of T.

// In short the subtype should satisfy every property of basetype.

class Base5 {

    public int x = 5;

    public void foo() {
        System.out.println("Base");
    }
}

class Derived5 extends Base5 {
    private int x = 10;

    public void foo() {
        System.out.println("Derived");
    }
}

public class Ex5 {
    public static void main(String args[]) {
        Base5 b = new Derived5();

        System.out.println(Base5.x + ", " + Derived5.x);
    }
}