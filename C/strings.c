#include <stdio.h>
int main() {
    char c[10]; // c is a constant pointer variable of type char
    char *c1 = c + 1; // c1 is a pointer variable of type char and it is not constant
    char x[5] = "abcde"; // x is a constant character pointer varaible
    // /printf("x is %p\n",x); //  %p is used to print address value

    /* x[i] <==> *(x+i)
    */

    for (int i=0; i<5; i++) {
        //printf("The value stroded at address x + %d is %c\n",i,x[i]);
    }

    char ch; // This is a character variable
    //c = x; // Error because lvalue is not modifiable
    int y[10]; // y is also a constant int pointer

    // Character pointer arithmetic below
    printf("Character pointer arithmetic below");
    for (int i=0;i < 10;i++) {
        c[i] = 'i';
        *(c + i) = 'i'; // This line shows you the pointer arithmetic
        // In first loop you add 0 to c
        // In second loop you add 1 to c
        //.......
        printf("%p\n",c+i);
    }
    printf("Integer Pointer Arithmetic below\n");
    // Integer Pointer Arithmetic below
    for (int i=0;i < 10;i++) {
        *(y+i) = i;
        printf("%p\n",y+i);
    }
    int *y1 = y+1;

    // printf("Integer pointer addition is %p,%p\n",y,y1);
    // printf("Character pointer addition is %p,%p\n",c,c1);
}