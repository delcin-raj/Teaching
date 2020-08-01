#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Compiler replaces Node as struct node
typedef struct node {
    int key;
    // You can store a complex data here
    // struct record data;
    struct node* left;
    struct node* right;
}Node;

// In general it should accept data
void insert (int,Node**);
int isEmpty(Node*);
void inorder(Node*);
void preorder(Node*);
Node* search(Node*,int);

Node* search(Node* tree,int key) {
    if (isEmpty(tree)) {
        return NULL;
    }
    // Else is not required because if the above condition is true
    // The function will return NULL and terminate
    else {
        Node* a = tree;
        while (a->key != key) {
            if (key < a-> key) {
                a = a->left;
            }
            else {
                a = a->right;
            }
            // Every node can be treeted as a root of a subtree of tree
            if (isEmpty(a)) {
                return NULL;
            }
        }
        return a;
    }
}

int isEmpty(Node* tree) {
    if (tree == NULL) {
        return 1;
    }
    else {
        return 0;
    }
}

void insert (int key,Node** treeAdd) {
    // Block creationg
    Node* newBlock = (Node*) malloc(sizeof(Node));
    newBlock -> key = key;
    newBlock -> left = NULL; 
    newBlock -> right = NULL; 
    if (isEmpty(*treeAdd)) {
        *treeAdd = newBlock;
    }
    else {
        // We are going to search for the appropriate node to insert
        // the newBlock
        Node* x, *y = *treeAdd;
        while (y != NULL) {
            x = y;
            if (key <= y->key) {
                y = y->left;
            }
            else {
                y = y->right;
            }
        }
        if (key <= x->key) {
            x->left = newBlock;
        }
        else{
            x->right = newBlock;
        }
    }
}

// Introduction to recursion
void inorder(Node* y) {
    if (y->left != NULL) {
        inorder(y->left);
        // You are doing this to reach the left most corner
    }
    // If you reach here it means you have printed the left-subtree
    printf("%d->",y->key); // Now print the current node
    // Now you are printing the right subtree
    if (y->right != NULL) {
        inorder(y->right);
    }
}

void preorder(Node* y) {
    printf("%d->",y->key);
    if (y->left != NULL) {
        preorder(y->left);
    }
    if (y->right != NULL) {
        preorder(y->right);
    }
    
}


// You do postorder

int main() {
    srand(time(0));
    Node* tree = NULL;
    for (int i=0; i<10; i++) {
        insert(rand()%50,&tree);
    }
    if (isEmpty(tree)) {
        printf("Tree is empty\n");
    }
    else {
        inorder(tree);
        printf("\n");
        preorder(tree);
        printf("\n");
    }
}