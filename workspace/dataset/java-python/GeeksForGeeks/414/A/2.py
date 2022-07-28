

# Python3 Implementation to Count the no. of  
# Sub-arrays which contains all elements  
# from 1 to length of subarray  
import sys 
  
INT_MAX = sys.maxsize; 
INT_MIN = -(sys.maxsize - 1); 
  
# Function to count the number  
# Sub-arrays which contains all elements  
# 1 to length of subarray  
def countOfSubarrays(arr, n) :  
  
    count = 0; 
    v = [0]*(n + 1);  
  
    # Map all elements of array with their index  
    for i in range(n) : 
        v[arr[i]] = i;  
  
    # Set the max and min index equal to the  
    # min and max value of integer respectively.  
    maximum = INT_MIN;  
    minimum = INT_MAX;  
  
    for i in range(1, n + 1) : 
  
        # Update the value of maximum index  
        maximum = max(maximum, v[i]);  
  
        # Update the value of minimum index  
        minimum = min(minimum, v[i]);  
  
        # Increase the counter if difference of  
        # max. and min. index is less than the  
        # elements iterated till now  
        if (maximum - minimum < i) : 
            count = count + 1;  
  
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 4, 1, 3, 2, 5, 6 ];  
    n = len(arr);  
    print(countOfSubarrays(arr, n));  
  
# This code is contributed by AnkitRai01 

