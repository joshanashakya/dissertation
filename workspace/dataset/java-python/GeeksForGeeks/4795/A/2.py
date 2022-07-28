

# Python 3 program to swap 4 variables 
# without using temporary variable. 
  
def swap(a, b, c, d): 
  
    # swapping a and b variables 
    a = a + b 
    b = a - b 
    a = a - b 
  
    # swapping b and c variables 
    b = b + c 
    c = b - c 
    b = b - c 
  
    # swapping c and d variables 
    c = c + d 
    d = c - d 
    c = c - d 
  
    print("values after swapping are : ") 
    print("a = " , a) 
    print("b = " , b) 
    print("c = " , c) 
    print("d = " , d) 
  
  
# driver function 
  
# initialising variables 
a = 1
b = 2
c = 3
d = 4
  
print("values after swapping are : ") 
print("a = " , a) 
print("b = " , b) 
print("c = " , c) 
print("d = " , d) 
print("") 
swap(a, b, c, d) 
  
# This code is contributed by Smitha. 

