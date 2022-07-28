

# Python3 program to check whether  
# it is possible or not to move from  
# (0, 0) to (x, y) in exactly n steps  
  
# Function to check whether it is  
# possible or not to move from  
# (0, 0) to (x, y) in exactly n steps  
def Arrive(a, b, n): 
      
    if (n >= abs(a) + abs(b) and 
       (n - (abs(a) + abs(b))) % 2 == 0): 
        return True
  
    return False
  
# Driver code  
a = 5
b = 5
n = 11
  
if (Arrive(a, b, n)):  
    print("Yes")  
else: 
    print("No")  
  
# This code is contributed 
# by Yatin Gupta      

