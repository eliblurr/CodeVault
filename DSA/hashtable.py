class HashTable:
    def __init__(self, size):
        self.table = [[],] * size
        self.size = size

    def checkPrime(self, n):
        if n == 1 or n == 0:
            return 0
        for i in range(2, n//2):
            if n % i == 0:
                return 0
        return 1

    def getPrime(self, n):
        if n % 2 == 0:
            n = n + 1
        while not self.checkPrime(n):
            n += 2
        return n

    def hashFunction(self, key):
        "returns index"
        capacity = self.getPrime(self.size)
        return key % capacity

    def insert(self, key, data):
        index = self.hashFunction(key)
        self.table[index] = [key, data]

    def remove(self, key):
        index = self.hashFunction(key)
        self.table[index] = 0

# This hash table does not make up for collisions
# holding the head of a doubly linked list will handles the issue of collision by allow multiple values to be stored at a given index
# this form of collision handling is called chaining

ht = HashTable(10)

ht.insert(123, "apple")
ht.insert(432, "mango")
ht.insert(213, "banana")
ht.insert(654, "guava")

print(ht.table)

ht.remove(123)

print(ht.table)