

# Python 3 program to move form 
# (a, 0) to (b, 0) with given jumps 
  
# Function to check if it 
# is possible 
def Move(a, x, b): 
  
    if ((((b - a) % x == 0) or 
         ((b - a - 1) % x == 0) and 
           a + 1 != b) and b >= a): 
        return True
  
    return False
  
# Driver code 
if __name__ == "__main__": 
    a = 3
    x = 2
    b = 7
  
    # function call 
    if (Move(a, x, b)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed  
# by ChitraNayal 

