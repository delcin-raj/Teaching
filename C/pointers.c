#include <stdlib.h>
#include <stdio.h>
int main() {
    int a = 5; // This instructs the compiler to allocate a space for 
    double b;
    int* x = &a; // similarly this instructs the compiler to allocate space for x
    double* y = &b;
    if (x == NULL || y == NULL) {
        printf("NULL");
    }
    void* p;
    *x = 10; *y = 10;
    double *y1;
    // p is a void pointer and hence the below assignments are legal
    
    // After this assignment x points to a new address of type double
    y1 = y; // I'm making both x and y point to same address
    *y1 = 124384322; // This operation only changes the 4 bytes of the valid block
             // pointed by y
    printf ("x -> %d, y -> %f\n",*x,*y);
    int *z = (int *) malloc(sizeof(int));
}