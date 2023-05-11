
class Stack:
    ''' Dynamic Stack '''
    def __init__(self):
        self.__stack = []

    def isEmpty(self):
        return len(self.__stack) == 0

    def push(self, elem):
        '''
            complexity -> O(1) -> constant time
        '''
        self.__stack.append(elem)

    def pop(self):
        '''
            complexity -> O(1) -> constant time
        '''
        return None if self.isEmpty() else self.__stack.pop()

    # Defining __call__ method
    # allows instances to behave like methods
    def __call__(self):
        print("default stack behavior demo")
        print("push 1, 2, 3")
        self.push(1)
        self.push(2)
        self.push(3)
        print(self.__stack)
        print("pop twice from stack")
        self.pop()
        self.pop()
        print(self.__stack)

s = Stack()
s()
        
