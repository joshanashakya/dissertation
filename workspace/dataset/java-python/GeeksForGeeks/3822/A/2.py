

# Python3 implementation of the approach  
  
# Function to return the count of 
# the required sub-sets  
def count(arr, n, x) : 
  
    # Every element is divisible by 1  
    if (x == 1) : 
        ans = pow(2, n) - 1
        return ans;  
      
    # Count of elements which are  
    # divisible by x  
    count = 0
    for i in range(n) :  
        if (arr[i] % x == 0) : 
            count += 1
  
    ans = pow(2, count) - 1
    return ans  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 4, 3, 5 ]  
    n = len(arr) 
    x = 1
    print(count(arr, n, x)) 
  
# This code is contributed by Ryuga 

