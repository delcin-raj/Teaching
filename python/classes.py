
# # Example 1
# from tkinter import *
# # Tk is a class defined in module tkinter

# # Class A extends Tk {}


# class A(Tk):
#     pass


# a = A()
# a.mainloop()

# # Example 2
# # not a good practice to do A().x='some value'
# class A:
#     pass

# Example 3
# Right way to define fields

class A:
    def __init__(self, var1, var2, var3):
        self.var1 = var1
        self.var2 = var2
        self.var3 = var3

    # __str__ function is similar to toString in java
    def __str__(self):
        return f'{self.var1, self.var2, self.var3}'
# a = A(3,5,'feefa'); a.__repr__() => __repr__(a)
# REPL


print(A(1, 2, 3))
