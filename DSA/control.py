
# if statement 
if 4 > 1:
    # body of if statement
    pass

# if else statement 
if 1 > 3:
    # body of if statement
    pass
else:
    pass

# for loop
for val in [1,2,3]:
    pass

for val in range(5):
    pass

# list comprehension
[i for i in range(4)]

# for loop with else -> The else part is executed when the loop is finished.
for i in range(5):
    pass
else:
    print("inside else")

# while loop
i = 0
while i < 5:
    print(i)
    i +=1

# while loop with else -> the else part is executed after the condition in the while loop evaluates to False
j = 0
while j < 5:
    print(j)
    j+=1
else:
    print("inside else")

# the for loop is usually used when the number of iterations is known and while loop is usually used when the number of iterations are unknown

# can be used in place or switch or alternative would be to use traditional if-else
# match "some term":
    
#     case "pattern-1":
#         pass
#         #  action-1
#     case pattern-2:
#          action-2
#     case pattern-3:
#          action-3
#     case _:
#         action-default