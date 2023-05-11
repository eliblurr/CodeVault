"""
An Iterable is basically an object that any user can iterate over. [iterables have generate iter() method. when you inspect you'll see methos __iter__]
An Iterator is also an object that helps a user in iterating over another object (that is iterable). [uses next() method, they have __next__ when you inspect]
 -> Iterators are methods that iterate collections like lists, tuples, et
"""

ls = [1,2,3,4,5]
print(dir(ls))

s=[1,3,4,5]
s=iter(s)
print(s)
print(next(s))

s="bjahsdjbh"
s=iter(s)
print(s)
print(next(s))
print(next(s))
print(next(s))
print(next(s))

# for loop is and example of an in built iterator