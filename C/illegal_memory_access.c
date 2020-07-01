#include <stdlib.h>

// int * fun() {
//     int x;
//     return &x; // returns the address of the local variable
// }

int main() {
    // int *p;
    // p = fun(); We don't want this error now
    // The address returned by fun() is out of bounds of the program stack
    // As the block allocated to fun() was popped out
    // Only when you access the illegal address you get segmentation fault
    // Without the line below there will be no run time error
    // *p = 50.9; // gives segmentation fault
    // What does it mean write *p = some_value
    // It means you are telling the compiler to store some_value 
    // in the address stored in the pointer variable p
    
    /* Now it's time for segmentation fault in arrays */
    // int x[100];
    // for (int i=0; i < 1000; i++) {
    //     x[i] = i;
    // }
    // The array with head x is stored in the stack

    // Now let's talk about heap memory
    // Heap memory is any memory that is out of the 
    // space allocated to program stack

    // We can write code in such a way that the memory in heap
    // is allocated for our program.
    // NOTE: A program only have limited access(Maximum stack size) to memory 
    // And it's boundary was defined by the OS, compiler and 
    // computer architecture combined

    //CREATING A VARIABLE IN HEAP MEMORY
    // void *p1;
    // double *f1;
    // *f1 = 10.0;
    // int *x1 = (int *)  malloc(sizeof(int));
    // *x1 = 8;
    // x1 = f1;
    //*x1 = 0;
    /**Explanation of malloc
     * Function signature -> void * malloc(int);
     * It It accepts a integer value as argument 
     * It returns a void pointer
     * Hence we type caste it into integer pointer
     */
    return 0;
}