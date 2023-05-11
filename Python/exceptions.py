class MyCustomException(Exception):
    def __init__(self, message:str = 'default message'):
        self.message = message
        super().__init__(self.message)

    def _message(self):
        return self.message

try:
    raise MyCustomException("some error message")
except MyCustomException as e:
    print(e._message())
