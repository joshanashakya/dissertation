

# Python 3 implementation of the approach  
  
# Function to returns the required count of integers  
def countWays(n, arr, k) : 
  
    if (k <= 0 or k >= n) : 
        return 0
  
    s = set() 
    for element in arr : 
        s.add(element) 
          
    if (len(s) <= k) : 
        return 0;  
  
    # Return the required count  
    return len(s) - k;  
  
  
# Driver code  
if __name__ == "__main__" : 
      
    arr = [ 100, 200, 400, 50 ]  
    k = 3;  
    n = len(arr) ; 
    print(countWays(n, arr, k))  
  
# This code is contributed by Ryuga 

