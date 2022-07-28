

# Python3 implementation of the approach 
  
# Function to return the count 
# of different arrays 
def countSum(N, L, R): 
  
    # No such combination exists 
    if (L > R): 
        return 0; 
  
    # Arrays formed with single elements 
    if (N == 1): 
        return R - L + 1; 
    if (N > 1): 
        return (N - 2) * (R - L) + 1; 
      
    return 0; 
  
# Driver code 
if __name__ == '__main__': 
    N, L, R = 4, 4, 6; 
  
    print(countSum(N, L, R)); 
  
# This code is contributed by 29AjayKumar 

