import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * An interface looks like this
 * Interface List<T> {
 *    public void insert(<T>);
 *    public void delete(<T>);
 *    public boolean contains(<T>,value);
 * }
 * 
 * class LinkedList implements List {
 *     I have to give implementation to all the methods specified in the 
 *     List interface
 *     If it does implements all the methods specified in List then 
 *     LinkedList is of type List
 * }
 * class ArrayList implements List {
 *     I have to give implementation to all the methods specified in the 
 *     List interface
 * }
 * 
 * 
 */







class RemoveDuplicatesTheRightWay {
    public static List<Integer> removeDuplicates(List<Integer> array) {
        // In java Set is an interface
        // HashSet is a class which implements the interface Set
        // In an interface there will only be method specifications
        // whichever class implements the interface should give functionality
        // to the methods specified in the interface
        Set<Integer> elements = new HashSet<>();

        // If you need an array integer you should do this
        List<Integer> result = new ArrayList<>();
        // elements variable is of type Set eventhough the object it refers to
        // is of type Hashset
        // This is allowed because HashSet is also a Set
        for (int e: array) {
            if (!elements.contains(e)) {
                elements.add(e);
                result.add(e);
            }
        }
        // for (int e: array) {
        //     if (!result.contains(e)) {
        //         result.add(e);
        //     }
        // } // space complexity is n because sizeof(result) <=n
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            // 0 to 5
            array.add(random.nextInt(5));
        }
        System.out.println(array);
        System.out.println(removeDuplicates(array));
    }
}