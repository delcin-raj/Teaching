#include <stdio.h>
#include <stdlib.h>
#include<time.h>

void insertionSort(int* arr,int n,int r) {
    if (r < n) {

    }
}

int main () {
	int A[50], sortedArray[50];
	srand(time(0));
	for (int i = 0; i < 50; i++) {
		A[i] = (rand() % 100)+1;
	}
	for (int i = 0; i < 50; i++) {
		printf("%d\n",A[i]);
	}
	printf("\n");
	insertionSort (A,50,0);

	for (int i = 0; i < 50; i++) {
		printf("%d\n",A[i]);
}
return 0;
}