class A():
    # In java when you declare a constructor or an object method
    # inside a class you will implicity pass this(synonymous to self)
    # But in python you should explicitly pass it as the first argument
    def __init__(self,first,second):
        self.first = first
        self.second = second
