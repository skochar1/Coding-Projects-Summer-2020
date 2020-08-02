class DLL():
    def __init__(self, values = None): #values is an array of data
        self.head = None
        self.tail = None

class Queue(DLL):
    def __init__(self, data, values = None):
        DLL.__init__(self,values)

my_queue = Queue(2, [1, 2, 3])
my_DLL = DLL([1, 2])
my_DLL.data #would throw an error because DLL does not have a data attribute, but Queue does
