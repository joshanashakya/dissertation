

# Python3 implementation of 
# the above approach 
  
mod = 1e9 + 7; 
  
# Find the number of ways 
# to reach the end 
def ways(i, arr, n): 
      
    # Base case 
    if (i == n - 1): 
        return 1; 
  
    sum = 0; 
  
    # Recursive structure 
    for j in range(1, arr[i] + 1): 
        if(i + j < n): 
            sum += (ways(i + j, arr, n)) % mod; 
            sum %= mod; 
  
    return int(sum % mod); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [5, 3, 1, 4, 3]; 
  
    n = len(arr); 
  
    print(ways(0, arr, n)); 
  
# This code is contributed by PrinciRaj1992 

