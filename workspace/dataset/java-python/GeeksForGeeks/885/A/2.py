

# Python3 implementation of the approach  
  
# Function to return the count of  
# maximum consecutive 1s in the  
# binary represntation of x  
def maxConsecutiveOnes(x) :  
  
    # Initialize result  
    count = 0;  
  
    # Count the number of iterations to  
    # reach x = 0.  
    while (x != 0) : 
          
        # This operation reduces length  
        # of every sequence of 1s by one  
        x = (x & (x << 1));  
  
        count += 1;  
      
    return count;  
  
# Function to return the count of  
# maximum consecutive 1s in the  
# binary represntation among all  
# the elements of arr[]  
def maxOnes(arr, n) :  
  
    # To store the answer  
    ans = 0;  
  
    # For every element of the array  
    for i in range(n) : 
  
        # Count of maximum consecutive 1s in  
        # the binary representation of  
        # the current element  
        currMax = maxConsecutiveOnes(arr[i]);  
  
        # Update the maximum count so far  
        ans = max(ans, currMax);  
  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4 ];  
    n = len(arr);  
  
    print(maxOnes(arr, n));  
  
# This code is contributed by AnkitRai01 

