

# Python3 implementation to find the 
# series in which every term is 
# sum of previous K terms 
  
# Function to generate the 
# series in the form of array 
def sumOfPrevK(N, K): 
    arr = [0]*N; 
    prevsum = 0; 
    arr[0] = 1; 
  
    # Pick a starting point 
    for i in range(N-1): 
  
        # Computing the previous sum 
        if (i <= K): 
            arr[i + 1] = arr[i] + prevsum; 
            prevsum = arr[i + 1]; 
        else: 
            arr[i + 1] = arr[i] + prevsum - arr[i + 1 - K]; 
            prevsum = arr[i] + prevsum; 
  
    # Loop to prthe series 
    for i in range(N): 
        print(arr[i], end=" "); 
      
# Driver code 
if __name__ == '__main__': 
    N = 8; 
    K = 3; 
    sumOfPrevK(N, K); 
          
# This code is contributed by 29AjayKumar 

