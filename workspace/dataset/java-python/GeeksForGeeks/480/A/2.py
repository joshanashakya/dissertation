

# Python3 implementation for the above approach 
import sys 
  
# function to return the count  
def count_greater(arr, n) :  
  
    min = sys.maxsize;  
    counter = 0;  
  
    # Comparing the given element  
    # with minimum element till  
    # occurred till now.  
    for i in range(n - 1, -1, -1) :  
        if (arr[i] > min) : 
            counter += 1;  
      
        # Updating the min variable  
        if (arr[i] <= min) : 
            min = arr[i];  
  
    return counter;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 3, 2, 1, 2, 3, 4, 5 ];  
    n = len(arr);  
  
    print(count_greater(arr, n));  
      
# This code is contributed by AnkitRai01 

