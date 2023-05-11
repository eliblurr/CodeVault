#  read

'''
with keyword in python the with keyword is used when working with unmanaged resources (like file streams). In Python, we can use the with...open syntax to automatically close the file.
it allows you to ensure that a resource is "cleaned up" when the code that uses it finishes running, even if exceptions are thrown. It provides 'syntactic sugar' for try/finally blocks.
'''

# file modes determine what operations we want to perform with files
# open() method is used to open files

file1 = open("test.txt", "a")

try:
    file1 = open("test.txt", "x")
except Exception as e: 
    print(e)
finally:
    # close the file
    file1.close()

"""
"x" - Create - will create a file, returns an error if the file exist
"a" - Append - will create a file if the specified file does not exist
"w" - Write - will create a file if the specified file does not exist
"r" - read - read from file
"""



#  write to file
with open('test.txt', 'w') as file2:
    # write contents to the test2.txt file
    file2.write('some is Fun.\n')
    file2.write('simple for starters')

# write to file using print
with open('test.txt', 'a') as f:
    print("\n\nI was written via print\n", file=f)

# read from file 
with open("test.txt", "r") as f:
    content = f.read()
    print(content)

# read from file 
with open("test.txt", "r") as f:
    content = f.readline()
    print(content)

# read from file 
with open("test.txt", "r") as f:
    content = f.readlines()
    print(content)

# see more operations -> https://www.programiz.com/python-programming/file-operation