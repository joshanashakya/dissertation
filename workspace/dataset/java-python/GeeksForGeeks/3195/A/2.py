

# A simple python3 program to find Number of triplets 
# in array having subarray xor equal 
  
# Function to return the count 
def xor_triplet(arr, n): 
      
    # Initialse result 
    ans = 0; 
  
    # Pick 1st element of the triplet 
    for i in range(n): 
  
        # Pick 2nd element of the triplet 
        for j in range(i + 1, n): 
  
            # Pick 3rd element of the triplet 
            for k in range(j, n): 
  
                xor1 = 0; xor2 = 0; 
  
                # Taking xor in the 
                # first subarray 
                for x in range(i, j): 
                    xor1 ^= arr[x]; 
  
                # Taking xor in the 
                # second subarray 
                for x in range(j, k + 1): 
                    xor2 ^= arr[x]; 
  
                # If both xor is equal 
                if (xor1 == xor2): 
                    ans += 1; 
  
    return ans; 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 4, 5]; 
    n = len(arr); 
  
    # Function Calling 
    print(xor_triplet(arr, n)); 
      
# This code is contributed by PrinciRaj1992 

