"""
Generators are useful when we want to produce a large sequence of values, but we don't want to store all of them in memory at once
"""
def list_value_generator(ls: list):
    for val in ls:
        yield val

gen = list_value_generator([12,32,43,34])

for val in gen:
    print(val)

# generator expression
val = (item for item in range(6))
print(val)
print([val for val in val])

gen = list_value_generator([32,43,434,123])
print(next(gen))
print(next(gen))
print(next(gen))
print(next(gen))
