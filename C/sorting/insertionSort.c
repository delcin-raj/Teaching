#include <stdio.h>
#include <stdlib.h>
#include<time.h>

// if you declare int pointer[]; then the pointer variable
// is a constant
// why the argument in the function should be constant?
// why its value should not be changed?
void insertionSort(int* arr,int n) {
	int key, j;	
	for (int i = 1; i < n; i++) {
		key = arr [i];
		j = i - 1; 
		// assumption is that the arr[0:r-1] is sorted 
		// initial value of j is r-1
		// value of j decreases only if key < arr[j]
		// if key > arr[j] then key > arr[k] for all
		// k belongs to {1,2,...,j-1}
		// if arr[j] > key then the correct position of
		// arr[j] in the arr[0:r] is arr[j+1]
		while (j >= 0 && arr [j] > key) {
			arr [j+1] = arr [j];
			j--;
		}
		arr [j+1] = key;
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
	insertionSort (A,50);

	for (int i = 0; i < 50; i++) {
		printf("%d\n",A[i]);
}
return 0;
}