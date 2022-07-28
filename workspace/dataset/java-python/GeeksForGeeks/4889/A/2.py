

# Python3 implementation of the approach  
  
# Function to return the required element  
def getElement(a, n, S) : 
      
    # Sort the array  
    a.sort();  
  
    sum = 0;  
  
    for i in range(n) : 
          
        # If current element  
        # satisfies the condition  
        if (sum + (a[i] * (n - i)) == S) : 
            return a[i];  
              
        sum += a[i];  
  
    # No element found  
    return -1;  
  
# Driver Code 
if __name__ == "__main__" : 
      
    S = 5;  
    a = [ 1, 3, 2, 5, 8 ];  
    n = len(a) ; 
  
    print(getElement(a, n, S)) ; 
      
# This code is contributed by Ryuga 

