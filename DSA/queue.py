
"""
Working of Queue
Queue operations work as follows:
two pointers FRONT and REAR
FRONT track the first element of the queue
REAR track the last element of the queue
initially, set value of FRONT and REAR to -1

Enqueue Operation
check if the queue is full
for the first element, set the value of FRONT to 0
increase the REAR index by 1
add the new element in the position pointed to by REAR

Dequeue Operation
check if the queue is empty
return the value pointed by FRONT
increase the FRONT index by 1
for the last element, reset the values of FRONT and REAR to -1
"""

# Queue implementation in Python with dynamic list
class Queue:

    def __init__(self):
        self.__queue = []

    # Add an element
    def enqueue(self, item):
        self.__queue.append(item)

    # Remove an element
    def dequeue(self):
        if len(self.__queue) < 1:
            return None
        return self.__queue.pop(0)

    # Display  the queue
    def display(self):
        print(self.__queue)

    def size(self):
        return len(self.__queue)

# Queue with fixed length implementation in Python
class FixedLengthQueue:
    def __init__(self, size):
        self.__queue = [None] * size
        self.size = size
        self.front = self.rear = -1

    def enqueue(self, elem):
        if self.isFull(): 
            return 'queue is full'
        if self.front == -1:
            self.front = 0
        self.rear+=1
        self.__queue[self.rear] = elem

    def dequeue(self):
        if self.isEmpty():
            return 'empty queue'
        
        elem = self.__queue[self.front]
        if self.front >= self.rear:
            self.front = self.rear = -1
        else:
            self.front+=1
        
        return elem
    
    def display(self):
        if self.isEmpty(): return 'empty queue'
        
        print(
            "rear ->",
            *[self.__queue[i] for i in range(self.rear, self.front-1, -1)],
            "<- front",
            sep=" | "
        )
    
    def isEmpty(self):
        if self.front == -1:
            return True
        return False

    def isFull(self):
        print(self.front, self.rear)
        if self.front == 0 and self.rear == self.size-1:
            return True
        return False

print("Queue")
q = Queue()
q.enqueue("12")
q.enqueue("sam")
q.display()
q.dequeue()
q.display()

print("Fixed Length Queue")
fq = FixedLengthQueue(5)
fq.enqueue("12")
fq.enqueue("sam")
fq.enqueue("jam")
fq.enqueue("mam")
fq.enqueue("dam")
fq.display()
print("dequeue", fq.dequeue(), sep="=")
print("dequeue", fq.dequeue(), sep="=")
print("dequeue", fq.dequeue(), sep="=")
fq.display()
