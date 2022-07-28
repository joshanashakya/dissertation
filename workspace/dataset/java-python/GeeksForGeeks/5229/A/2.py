

# Python 3 program to implement 
# the above approach 
  
# Function to find the smallest  
# index such that there are no  
# 0 or 1 to its right 
def smallestIndex(a, n): 
      
    # Initially 
    right1 = 0
    right0 = 0
  
    # Traverse in the array 
    for i in range(n): 
          
        # Check if array element is 1 
        if (a[i] == 1): 
            right1 = i 
  
        # a[i] = 0 
        else: 
            right0 = i 
  
    # Return minimum of both 
    return min(right1, right0) 
  
# Driver code 
if __name__ == '__main__': 
    a = [1, 1, 1, 0, 0, 1, 0, 1, 1] 
    n = len(a) 
    print(smallestIndex(a, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

