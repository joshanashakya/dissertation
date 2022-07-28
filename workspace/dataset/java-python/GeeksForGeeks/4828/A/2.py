

# Python3 implementation of the approach 
  
# Function that returns true if 
# the sequence will contain B 
def doesContainB(a, b, c): 
    if (a == b): 
        return True
  
    if ((b - a) * c > 0 and (b - a) % c == 0): 
        return True
  
    return False
  
# Driver code 
if __name__ == '__main__': 
    a, b, c = 1, 7, 3
  
    if (doesContainB(a, b, c)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 29AjayKumar 

