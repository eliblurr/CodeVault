"""
a decorator is a design pattern that allows you to modify the functionality of a function by wrapping it in another function.
A Python decorator is a function that takes in a function and returns it by adding some functionality, callable that returns a callable
"""

# things you should know
# 1. nested functions
# 2. high order functions  

# nested functions
# function that is indide another function
def outer(x):
    def inner(y):
        return x + y
    return inner

add_2 = outer(2) # return function inner() -> similar to partial functions
res = add_2(4)
print(res)

# simple decorator without @ notation
def make_pretty(func):
    # define the inner function 
    def inner():
        # add some additional behavior to decorated function
        print("I got decorated")
        # call original function
        func()
    # return the inner function
    return inner

# define ordinary function
def ordinary():
    print("I am ordinary")
    
# decorate the ordinary function
decorated_func = make_pretty(ordinary)

# call the decorated function
decorated_func()
'''
@ Symbol With Decorator (suntactic sugar)
Instead of assigning the function call to a variable, Python provides a much more elegant way to achieve this functionality using the @ symbol
'''
# method level decorators
def outer(func):
    # @wraps(func)
    def inner(*args, **kwargs): # wrapper function
        print(args, kwargs)
        func(args, kwargs)
    return inner

@outer
def some_func(a, b, **key):
    print("called")

some_func(1,2, key=788)  

'''
functools.wraps() is a decorator that is applied to the wrapper function of a decorator. 
It updates the wrapper function to look like wrapped function by copying attributes such as __name__, __doc__ (the docstring), etc. 
'''

# python class as decorators
# -> add = ClassDecorator(32)(cus)
class ClassDecorator:
    def __init__(self, a):
        self.a = a

    def __call__(self, func):
        def wrapper(*args, **kwargs):
            print(f"instance variable passed :{self.a}")
            return func(*args, **kwargs)
        return wrapper

@ClassDecorator(23) # allows us to pass arguments to decorators
def cus():
    pass

cus()




import time

def time_exec(func):
    def timer(*args, **kwargs):
        start = time.perf_counter()
        res = func(*args, **kwargs)
        print("execution time: ", time.perf_counter() - start )
        return res
    return timer

@time_exec
def delay_func(t):
    time.sleep(t)
    print(f"delay_func to sleep {t} seconds")

delay_func(1.5) 
delay_func(1) 