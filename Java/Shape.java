class Circle {
    private double radius; // This is an object variable
    public static final double pi = 3.142; // This is a class varibale
                                           // because of the keyword
                                           // static. final keyword can be 
                                           // given to object variables also
                                           // final is similar to const in C
    
    // All class will have a constructor
    // It should be public
    // It has no return type. No even
    // It's actual signature is 
    // public Circle (Circle this,double radius)
    public Circle (double radius) {
        this.radius = radius;
    }       
    // area() is an object method because it does not have static keyword  
    // But what is actually happening here?
    // Actually the signature of area is

    // public double area(Circle this)      
                     
    public double area() { 
        return Circle.pi * this.radius * this.radius;
    }
}

public class Shape {
    // Java <==> C
    // String s <==> char s[]
    // String [] s <==> char s[][] <==> char **s
    // In programming @ usually means annotation
    // Basically it is used to say that a particular block of memory
    // is of some type
    public static void main (String []args) {
        Circle c1 = new Circle(5); // new <==> nmalloc
        // Now you can use c1 to call all the variables and
        // methods inside class Circle
        double a1 = c1.area();
        // c1.area() <==> area(c1)
    }
}