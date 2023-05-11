

class Node:
    def __init__(self, data):   
        self.data = data # public attr [not very oop]
        self.next = None # public attr [not very oop]

    def link(self, node):
        self.next = node

class LinkedList:
    def __init__(self, head):
        self.head = head

    def insert():pass
    def delete():pass
    def search():pass
    def display():pass

# create nodes
nd1 = Node(1)
nd2 = Node(2)
nd3 = Node(3)

# create links
nd1.link(nd2)
nd2.link(n32)

ll = LinkedList(nd1)
