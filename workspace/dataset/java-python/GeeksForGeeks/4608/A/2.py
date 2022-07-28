

# Python3 implementation 
  
# Function to return the 
# maximum xor 
def max_xor(arr, n): 
  
    maxXor = 0; 
  
    # Calculating xor of each pair 
    for i in range(n): 
        for j in range(i + 1, n): 
            maxXor = max(maxXor,\ 
                         arr[i] ^ arr[j]); 
  
    return maxXor; 
  
# Driver Code 
if __name__ == '__main__': 
  
    arr = [ 25, 10, 2, 8, 5, 3 ]; 
    n = len(arr); 
  
    print(max_xor(arr, n)); 
  
# This code is contributed by 29AjayKumar 

