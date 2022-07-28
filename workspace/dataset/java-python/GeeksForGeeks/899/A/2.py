

# Python3 implementation of above approach  
  
# print the numbers after dividing  
# them by their common factors  
def divide(a, b) : 
      
    # iterate from 1 to minimum of a and b  
    for i in range(2, min(a, b) + 1) :  
  
        # if i is the common factor  
        # of both the numbers  
        while (a % i == 0 and b % i == 0) : 
            a = a // i 
            b = b // i 
  
    print("A =", a, ", B =", b)  
  
# Driver code  
if __name__ == "__main__" : 
  
    A, B = 10, 15
  
    # divide A and B by their  
    # common factors  
    divide(A, B)  
      
# This code is contributed by Ryuga 

