

# Python program to count minimum length 
# subarray of 1's in a binary array. 
import sys 
  
# Function to count minimum length subarray 
# of 1's in binary array arr[0..n-1] 
def getMinLength(arr, n): 
    count = 0; # intitialize count 
    result = sys.maxsize ; # initialize result 
  
    for i in range(n): 
        if (arr[i] == 1): 
            count+=1; 
        else: 
            if(count != 0): 
                result = min(result, count); 
            count = 0; 
  
    return result; 
  
# Driver code 
arr = [ 1, 1, 0, 0, 1, 1, 1, 0, 
                1, 1, 1, 1 ]; 
  
n = len(arr); 
  
print(getMinLength(arr, n)); 
  
# This code is contributed by Rajput-Ji 

