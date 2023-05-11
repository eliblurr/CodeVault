# Data Structures and Algorithms
Data structure is a storage that is used to store and organize data.
Algorithms are simply steps followed to solve problems

# Factors that influence choice of data structure
- Element access times
- The data dynamics, such as changing or editing the data
- The size of the data
- The speed of data use

## Types of Data Structure
- linear (organize data/elements in a sequence)
    -   arrays (store data of similar type in continuous memory)
    -   stacks (LIFO)
    -   linked list (has nodes that hold the location(pointer) to the next element)
    -   queue (FIFO)
- non-linear (organize data/elements in a hierarchy)
    -   graphs (has nodes called vertex; nodes are connected to each other via edges(can be pointers); node edges are not limited)
    -   trees (has nodes called vertex; nodes are connected to each other via edges(can be pointers);there can only be one edge between two vertices)

### stacks(LIFO)
A stack is a linear data structure that follows the principle of Last In First Out (LIFO). This means the last element inserted inside the stack is removed first.

#### Basic Operations of Stack
- Push: Add an element to the top of a stack
- Pop: Remove an element from the top of a stack
- IsEmpty: Check if the stack is empty
- IsFull: Check if the stack is full
- Peek: Get the value of the top element without removing it

#### Applications of Stack Data Structure
-   reverse a word
-   In browsers: visited page history are stacks

### queue(FIFO)
A queue is a linear data structure that follows the principle of First In First Out (LIFO). This means the first element inserted inside the queue is removed first. It can be implemented using simple array for some types and linked list, heap structure, or a binary search tree for other use cases

#### Some types of queues
- simple queue: insertion takes place at the rear and removal occurs at the top
- circular queue: the last element points to the first element making a circular link. The main advantage of a circular queue over a simple queue is better memory utilization. If the last position is full and the first position is empty, we can insert an element in the first position. This action is not possible in a simple queue. Applications of Circular Queue include CPU scheduling, Memory management, Traffic Management
- priority queue: special type of queue where each element is associated with a priority and is served according to its priority. Insertion occurs based on the arrival of the values and removal occurs based on priority.
- deque: In a double ended queue, insertion and removal of elements can be performed from either from the front or rear. Thus, it does not follow the FIFO (First In First Out) rule.

### Basic Operations of Queue
- enqueue: add an element to the end of the queue
- dequeue: remove an element from the front of the queue
- isEmpty: check if the queue is empty
- isFull: check if the queue is full
- peek: get the value of the front of the queue without removing it

### linked lists
A linked list is a linear data structure that includes a series of connected nodes. Here, each node stores the data and the address(pointers) of the next node. the first node in this sequence is called the head, the last nore in the sequence is known as tail

#### Some types of linked lists
- singly linked list: nodes only references next element in seq
- doubly linked list: nodes reference previous and next element in seq 
- circular linked list: tail node references head node as its next element

### hash tables
A data stucture that enables key - value lookups

### trees
A tree is a nonlinear hierarchical data structure that consists of nodes connected by edges.

#### Types of Tree
- Binary Tree : A binary tree is a tree data structure in which each parent node can have at most two children
- Binary Search Tree : Binary search tree is a data structure that quickly allows us to maintain a sorted list of numbers.
- AVL Tree : AVL tree is a self-balancing binary search tree in which each node maintains extra information called a balance factor whose value is either -1, 0 or +1.
- B-Tree : B-tree is a special type of self-balancing search tree in which each node can contain more than one key and can have more than two children

`Self-Balancing Binary Search Trees are height-balanced binary search trees that automatically keeps height as small as possible when insertion and deletion operations are performed on tree.
`

#### Tree Traversal - breadth first(level order), depth first(inorder, preorder and postorder)
Traversing a tree means visiting every node in the tree.

#### `inorder traversal`
1. First, visit all the nodes in the left subtree
2. Then the root node
3. Visit all the nodes in the right subtree

```
inorder(root->left)
display(root->data)
inorder(root->right)
```

#### `preorder traversal`
1. Visit root node
2. Visit all the nodes in the left subtree
3. Visit all the nodes in the right subtree

```
display(root->data)
preorder(root->left)
preorder(root->right)
```

#### `postorder traversal`
1. Visit all the nodes in the left subtree
2. Visit all the nodes in the right subtree
3. Visit the root node

```
postorder(root->left)
postorder(root->right)
display(root->data)
```