# Object-Oriented Programming
## Objectives
```
I can create a class
I understand how and when to use built-in collections (sets, lists, tuples etc)
I can create custom exceptions
I can use list, set and dictionary comprehensions
I understand the concept of generator expressions
I can write a generator function that produces a sequence of numbers in a given range
I understand the difference between Iterables and Iterators
I can read from and write to files
I can create and use HOFs
I understand the difference between instance attributes and class attributes
I understand the difference between @classmethod and @staticmethod and when to use them
I understand the concept of a decorator
I can create a decorator to time the duration of execution of a function
I understand the concept of magic/dunder methods (e.g. init, add, len, repr) and how to use them
```

## dunder methods python
In Python, dunder methods are methods that allow instances of a class to interact with the built-in functions and operators of the language.

|Dunder method	    |       Usage / Needed for      |
|:--:| :--: |
| \_\_init__           | 	Initialise object           |
|\_\_new__	        |   Create object	🔗          |
|\_\_del__	        |   Destroy object	🔗          |
|\_\_repr__           |	Compute “official” string representation / repr(obj)	🗒️ 🔗       |
|\_\_str__	        |   Pretty print object / str(obj) / print(obj)	🗒️ 🔗       |
|\_\_call__	        |   Emulate callables / obj(*args, **kwargs)	🔗      |
|\_\_len__	        |   len(obj)	🔗      |
|\_\_iter__	        |   iter(obj) / for ... in obj (iterating over)	🔗      |
|\_\_reversed__	    |   reverse(obj)	🔗      |
|\_\_contains__	    |       ... in obj (membership test)	🔗      |

[click here to read more](https://mathspp.com/blog/pydonts/dunder-methods)