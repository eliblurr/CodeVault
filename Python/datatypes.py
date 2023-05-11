#  strings
my_first_string = "some random string"
print(my_first_string)

"""
multiline strings
"""

# some string operations
print(my_first_string*12) # multiplication
print(my_first_string+my_first_string) # contatenation

# Compare Two Strings
str1 = "Hello, world!"
str2 = "I love Python."
str3 = "Hello, world!"
print(str1 == str2)
print(str1 == str3)

# iterating through my_first_string string
for letter in my_first_string:
    print(letter)

# count length of my_first_string string
print(len(my_first_string))

print('a' in 'program') # check if a is in 'program'
print('at' not in 'battle') # check if 'at is not in 'battle'

# see all names available for strings
print(dir(my_first_string))
print(dir(str))

# python numbers 
num1 = 23 # integer
num2 = 23.34 # float or double
num3 = 8+2j # complex numbers

'''
Number System |	Prefix
Binary        | 0b or 0B
Octal	      | 0o or 0O
Hexadecimal	  | 0x or 0X
'''

# number systems
print(0b1101011)  # prints 107
print(0xFB + 0b10)  # prints 253
print(0o15)  # prints 13

# type conversion
num1 = int(2.3) # double to int

# string to int
some_str = "2323"
if some_str.isdigit():
    num1 = int("2323")
    print(num1)

import random

print(random.randrange(10, 20))

# get random item from list1
ls1 = ['43', '34b', 'c343', '343d', 'e']
print(random.choice(ls1))

import math
#  see names available on the math module
print(dir(math))

# COLLECTIONS

# A list with 5 integers
numbers = [1, 2, 3, 4, 5]

print(numbers)

# accessing list elements [done by index]
ls = ["asdasd", "adsasdasd", "asd+", 5, 43, "Sdf", 234]

# access item by index
print(ls[0])
print(ls[1])
print(ls[2])

# slicing list
print(ls[:]) # beginning to end
print(ls[2:5]) # items from index 2 to index 4
print(ls[5:]) # from index 5 to end

# add elements to a list

# append
ls.append("soem data")
# extend
ls.extend(["asdasd", "asdasd"])

# update list item
# by index
ls[0] = 323

# see namespaces available to lists
print(dir(ls))

# iterating through a List
for item in ls:
    print(item)

# check if an item exists in the list
print("asdasd" in ls)
print("78348347348" in ls)

# length of list
print(len(ls))

# list comprehension
pow_of_2 = [2**number for number in range(1, 6)]
print(pow_of_2)

# tuples
# A tuple is similar to a list. The difference between is that we cannot change the elements of a tuple once it is assigned whereas we can change the elements of a list.

tup = (12,234,54,56,34)

# access by indexing and slicing
tup[1]
tup[-2]
tup[1:3]

# see names availble by tuple
tup.index(12) # returns the first occurrence of '12' in tup

# iterating through a tuple
for t in tup:
    print(t)

# Sets
# A set is a collection of unique data

# create an empty set
empty_set = set()
empty_set_2 = {}

# add to set
empty_set.add("asd")
empty_set.add("asds")

print(empty_set)

# remove from set
langs = {'Swift', 'Java', 'Python'}
print('set:',langs)
removedValue = langs.discard('Java')
print('set after remove():', langs)

# see more namespaces available to sets 
print(dir(set))

# set operations
A = {1,2,4,5}
B = {1,3,6,7}

# union - combining 2 sets
print('union using |:', A | B)
print('union using union():', A.union(B))

# intersection - finding common elements
print('intersection using &:', A & B)
print('intersection using intersection():', A.intersection(B)) 

# difference - finding elements in A that are not in B
print('difference using -:', A - B)
print('difference using difference():', A.difference(B)) 

# symmetric difference - finding elements in A and B that are not common to A and B
print('symmetric difference using ^:', A ^ B)
print('symmetric difference using symmetric_difference():', A.symmetric_difference(B)) 

# set equality
A = {1, 3, 5}
B = {3, 5, 1}

if A == B:
    print('Set A and Set B are equal')
else:
    print('Set A and Set B are not equal')

#  dictionary - key value pairs
some_dict = {"Nepal": "Kathmandu", "Italy": "Rome", "England": "London", 32:34, 344:"2333"}
print(some_dict)

# add elements to dict
some_dict["new_key"] = 3 + 45j

# update value
some_dict["Nepal"] = "Stan"

# all keys
print(some_dict.keys())
# all values
print(some_dict.values())
# dict items as list of tuples
print(some_dict.items())

# remove from doctionary
# del some_dict[111] # throws keyerror is key soesnot exist

# dict memberships -> membership tests for key only not value
print(49 in some_dict)

# Iterating through a Dictionary
squares = {1: 1, 3: 9, 5: 25, 7: 49, 9: 81}
for i in squares:
    print(squares[i])

for k,v in squares.items():
    print(k, v, sep=" : ")

# see all namespaces available
print(dir(dict))

# dict comprehension
print({k:v*2 for k,v in  squares.items()})

# set comprehension
print({v*23 for v in {1,2,3,4}})