

# Python3 implementation of the above approach  
import sys 
  
def solve(arr, n, k) :  
  
    minx = sys.maxsize;  
  
    # Finding the minimum element  
    for i in range(n) : 
        minx = min(minx, arr[i]);  
  
    decrements = 0;  
  
    # Loop over all the elements  
    # and find the difference  
    for i in range(n) :  
        if ((arr[i] - minx) % k != 0) : 
            return -1;  
          
        else : 
            decrements += ((arr[i] - minx) // k);  
      
    # Solution found and returned  
    return decrements;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 3;  
    k = 3; 
    arr = [ 12, 9, 15 ];  
  
    print(solve(arr, n, k));  
  
# This code is contributed by AnkitRai01 

