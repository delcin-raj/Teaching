class PrivateCircle {
    private double radius;

    public void setRadius(final double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("radius should be >0 0");
        }
    }
    public double getRadius() {
        return this.radius;
    }

}

class PublicCircle {
    public double radius;
}

public class PrivatePublic {
    public static void main(String[] args) {
        PublicCircle c1 = new PublicCircle();
        c1.radius = -9.0; // Allowed with public variable 
        PrivateCircle c2 = new PrivateCircle();
        c2.setRadius(-9); // Will throw an exception
        // So we have encapsulation using private variables
        // i.e., we have control over the values assigned to the 
        // fields inside our class
    }
}


