

# Python3 program to find maximum number  
# of prime factors for a number in range [1, N] 
  
# Return smallest number having maximum 
# prime factors. 
def maxPrimefactorNum(N): 
  
    # Sieve of eratosthenes method to count 
    # number of unique prime factors. 
    arr = [0] * (N + 1); 
    i = 2; 
    while (i * i <= N):  
        if (arr[i] > 0): 
            for j in range(2 * i, N + 1, i): 
                arr[j] += 1; 
        i += 1; 
  
        arr[i] = 1;  
  
    # Return maximum element in arr[] 
    return max(arr); 
  
# Driver Code 
N = 40; 
print(maxPrimefactorNum(N)); 
  
# This code is contributed by mits 

