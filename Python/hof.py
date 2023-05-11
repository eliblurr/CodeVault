"""
In general, a higher-order function is simply a function that takes one or more functions as arguments and/or produces a function as a result. 
e.g -> map(func, iterable), filter(func, iterable) 
"""

def add(x, y):
    return x + y

def sub(x, y):
    return x - y

def mul(x, y):
    return x * y

def exp(x, y):
    return x ** y
    
def hof(func, x, y):
    return func(x, y)

def getfunc(key:str):
    dt = {
        "add":add,
        "sub":sub,
        "mul":mul,
        "exp":exp,
    }
    return dt[key]

print(hof(mul, 1, 2))

print(getfunc("add"))
print(getfunc("sub"))
print(getfunc("mul"))
print(getfunc("exp")(3,4))