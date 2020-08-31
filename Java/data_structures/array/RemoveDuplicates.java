
import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {

// This should not be a void function
// you should define the function removeDuplicates separately
// this function should also accept an array and it should return the array of same type
// what should be the type of array?
// Should the type be an Int array or a string array or array of any type?
// I will define a class Idiots
// Idiots idio1 and Idiots idiot2 
// I also defined a function to compare two idios
// Why can't I remove the duplicates of idiots in the Idiots array?


public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.print("no. of elements in an array: ");
        int n = input.nextInt();

        System.out.print("Enter the array elements one after the other \n");
int[] myArray = new int[n];
for (int i = 0; i < n; i++) {
        System.out.print(""); // pigeon hole priciple if you chose n bokes and more than n pigeons
        // at least one box will have two pigeons.
        // choose array size n and k < n use %k
myArray[i] = input.nextInt();
}
System.out.println("Original Array" + Arrays.toString(myArray));


for (int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {
        if(myArray[i] == myArray[j]) {
            for(int k = j; k < n-1; k++) {
                myArray[k] = myArray[k + 1];
            }
        n--;
        j--;
        }
    }
}
System.out.println("New Array after the removal of duplicates" + Arrays.toString(myArray));

for (int i = 0; i < n; i++) {
System.out.print(myArray[i]);
}


System.out.println("New Array after the removal of duplicates" + Arrays.toString(myArray));
       
}
}

