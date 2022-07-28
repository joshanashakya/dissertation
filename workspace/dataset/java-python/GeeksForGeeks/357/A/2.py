

# Python3 implementation of the approach 
import sys 
  
# Function to return the minimum operations 
# required to make all array elements equal 
def minOperations(arr, n) : 
  
    # To store the frequency 
    # of all the array elements 
    mp = dict.fromkeys(arr, 0); 
  
    # Traverse through array elements and 
    # update frequencies 
    for i in range(n) : 
        mp[arr[i]] += 1; 
  
    # To store the maximum frequency 
    # of an element from the array 
    maxFreq = -(sys.maxsize - 1); 
  
    # Traverse through the map and find 
    # the maximum frequency for any element 
    for key in mp : 
        maxFreq = max(maxFreq, mp[key]); 
  
    # Return the minimum operations required 
    return (n - maxFreq); 
  
# Driver code 
if __name__ == "__main__" : 
  
    arr = [ 2, 4, 6 ]; 
    n = len(arr) ; 
  
    print(minOperations(arr, n)); 
  
# This code is contributed by Ryuga 

