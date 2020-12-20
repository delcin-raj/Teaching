
class Base {
    public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    @Override
    public void show() {
        super.show();
        System.out.println("Derived::show() called");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}