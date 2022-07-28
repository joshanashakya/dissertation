

# Python3 implementation of the above approach.  
  
# function to find minimum sum  
def findSum(arr, n, k) :  
  
    # variable to store final answer  
    # and initialising it with the values  
    # when 0 elements is removed from the left and  
    # K from the right.  
    ans = arr[n - k - 1] - arr[0];  
  
    # loop to simulate removal of elements  
    for i in range(1, k + 1) : 
          
        # removing i elements from the left and and K-i elements  
        # from the right and updating the answer correspondingly  
        ans = min(arr[n - 1 - (k - i)] - arr[i], ans);  
  
    # returning final answer  
    return ans;  
  
# Driver code 
if __name__ == "__main__" :  
  
    # input values  
    arr = [ 1, 2, 100, 120, 140 ]; 
    k = 2;  
    n = len(arr);  
  
    # calling the required function;  
    print(findSum(arr, n, k));  
  
# This code is contributed by AnkitRai01 

