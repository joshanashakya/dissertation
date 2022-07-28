

# Python3 implementation of the approach  
import sys 
  
INT_MAX = sys.maxsize; 
  
# Function to return the count partitions  
# possible from the given array such that  
# the minimum element of any partition  
# divides all the other elements  
# of that partition  
def countPartitions(A, N) : 
  
    # Initialize the count variable  
    count = 0;  
  
    for i in range(N) :  
  
        # Find the minimum element  
        min_elem = min(A);  
  
        # Break if no minimum element present  
        if (min_elem == INT_MAX) : 
            break;  
  
        # Increment the count if  
        # minimum element present  
        count += 1;  
  
        # Replace all the element  
        # divisible by min_elem  
        for i in range(N) : 
            if (A[i] % min_elem == 0) : 
                A[i] = INT_MAX;  
  
    return count;  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 7, 6, 5, 4, 3, 2, 2, 3 ];  
    N = len(arr);  
  
    print(countPartitions(arr, N));  
  
# This code is contributed by AnkitRai01 

