

# Python3 implementation of the approach  
import sys; 
  
# Function to return the maximum sub-array sum  
def maxSubArraySum(a, size) :  
  
    # Initialized  
    max_so_far = -(sys.maxsize - 1); 
    max_ending_here = 0;  
  
    # Traverse in the array  
    for i in range(size) : 
  
        # Increase the sum  
        max_ending_here = max_ending_here + a[i];  
  
        # If sub-array sum is more than the previous  
        if (max_so_far < max_ending_here) : 
            max_so_far = max_ending_here;  
  
        # If sum is negative  
        if (max_ending_here < 0) : 
            max_ending_here = 0;  
      
    return max_so_far;  
  
# Function that returns the maximum  
# sub-array sum after removing an  
# element from the same sub-array  
def maximizeSum(a, n) :  
  
    cnt = 0;  
    mini = sys.maxsize; 
    minSubarray = sys.maxsize;  
  
    # Maximum sub-array sum using 
    # Kadane's Algorithm  
    sum = maxSubArraySum(a, n);  
  
    max_so_far = -(sys.maxsize - 1); 
    max_ending_here = 0;  
  
    # Re-apply Kadane's with minor changes  
    for i in range(n) : 
  
        # Increase the sum  
        max_ending_here = max_ending_here + a[i];  
        cnt += 1;  
        minSubarray = min(a[i], minSubarray);  
  
        # If sub-array sum is greater  
        # than the previous  
        if (sum == max_ending_here) : 
  
            # If elements are 0, no removal  
            if (cnt == 1) : 
                mini = min(mini, 0);  
  
            # If elements are more, then store  
            # the minimum value in the sub-array  
            # obtained till now  
            else : 
                mini = min(mini, minSubarray);  
          
        # If sum is negative  
        if (max_ending_here < 0) : 
  
            # Re-initialize everything  
            max_ending_here = 0;  
            cnt = 0;  
            minSubarray = sys.maxsize;  
  
    return sum - mini;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 1, 2, 3, -2, 3 ];  
    n = len(a) 
      
    print(maximizeSum(a, n));  
  
# This code is contributed by Ryuga 

