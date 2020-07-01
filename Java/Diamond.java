class A extends Object {
    public String retVal() {
        return "A";
    }
}

class B extends A {
    @Override
    public String retVal() {
        return "B";
    }
}

class C extends A {
    @Override
    public String retVal() {
        return "C";
    }
}

/**
 * class D extends B,C {
 *     // If no retVal() function was definded for D
 * }
 * D d = new D;
 * d.retVal() // This is legal because B,C and A all have implemented retVal
 * Because a subclass inherits all the methods and variables from it's superclass
 */

 