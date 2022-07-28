

# Python3 implementation of the approach  
  
# Function to return the length of  
# the largest subarray with  
# maximum possible GCD  
def findLength(arr, n) : 
  
    # To store the maximum number  
    # present in the array  
    x = 0;  
  
    # Finding the maximum element  
    for i in range(n) :  
        x = max(x, arr[i]);  
  
    # To store the final answer  
    ans = 0;  
  
    # Two pointer  
    for i in range(n) : 
  
        if (arr[i] != x) : 
            continue;  
  
        # Running a loop from j = i  
        j = i;  
  
        # Condition for incrementing 'j'  
        while (arr[j] == x) : 
            j += 1;  
              
            if j >= n : 
                break
  
        # Updating the answer  
        ans = max(ans, j - i);  
  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 2 ];  
    n = len(arr);  
  
    print(findLength(arr, n));  
      
# This code is contributed by AnkitRai01 

