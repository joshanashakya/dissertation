

# Python 3 implementation of 
# above approach 
  
# print the sum of common factors 
def sum(a, b): 
  
    # sum of common factors 
    sum = 0
  
    # iterate from 1 to minimum of a and b 
    for i in range (1, min(a, b)): 
  
        # if i is the common factor 
        # of both the numbers 
        if (a % i == 0 and b % i == 0): 
            sum += i 
  
    return sum
  
# Driver Code 
A = 10
B = 15
  
# print the sum of common factors 
print("Sum =", sum(A, B)) 
  
# This code is contributed 
# by Akanksha Rai 

