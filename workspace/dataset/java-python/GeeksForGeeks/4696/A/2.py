

# Python3 implementation of above approach 
import sys; 
  
# Function to check if it possible  
# to form rectangles with heights  
# as non-ascending 
def rotateRec(n, L, B): 
  
    # set maximum 
    m = sys.maxsize; 
  
    for i in range(n): 
  
        # replace the maximum with 
        # previous maximum 
        if (max(L[i], B[i]) <= m): 
            m = max(L[i], B[i]); 
  
        # replace the minimum  
        # with previous minimum 
        elif (min(L[i], B[i]) <= m): 
            m = min(L[i], B[i]); 
  
        # print NO if the above two  
        # conditions fail at least once 
        else: 
            return 0; 
      
    return 1; 
  
# Driver code 
  
# initialize the number 
# of rectangles 
n = 3; 
  
# initialize n rectangles 
# with length and breadth 
L = [5, 5, 6]; 
B = [ 6, 7, 8 ]; 
if(rotateRec(n, L, B) == 1): 
    print("YES"); 
else: 
    print("NO"); 
  
# This code is contributed by mits 

