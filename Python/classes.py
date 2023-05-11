# create class

class SomeClass:

    class_var = 43 # class variables -> can be accessed via instance and class

    def __init__(self):
        self.instance_var = 12 # instance variables -> can be accessed only via instance

    def instance_method(self): # instance method -> called on instance only otherwise on class and instance has to be passed
        self.instance_var = 788
        pass

    # a class method is a method that is bound to a class and not instance
    @classmethod # evaluated after function is defined
    def class_method(cls): # must have implicit first argument that represents the class
        cls.class_var = 500 # modify class state that is applicable to all instances

    # a static method is a method that is bound to a class and not instance
    @staticmethod # cannot access class or instance state
    def static_method(): 
        print("do something statically .e.g hach password")

print('class_var: ', SomeClass.class_var)

s = SomeClass()
print('instance_var: ', s.instance_var)
print('class_var: ', s.class_var)
s.instance_method()
SomeClass.instance_method(s)
print('instance_var: ', s.instance_var)

SomeClass.static_method()
SomeClass.class_method()
print('class_var: ', s.class_var)
