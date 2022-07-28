

# Python 3 implementation of the approach 
  
# Function that returns true if s 
# can be made lexicographically smaller 
# by reversing a sub-string in s 
def check(s): 
    n = len(s) 
  
    # Traverse in the string 
    for i in range(n-1): 
          
        # Check if s[i+1] < s[i] 
        if (s[i] > s[i + 1]): 
            return True
  
    # Not possible 
    return False
  
# Driver code 
if __name__ == '__main__': 
    s = "geeksforgeeks"
  
    if (check(s)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

