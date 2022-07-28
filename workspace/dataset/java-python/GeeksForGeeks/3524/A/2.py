

# Python3 program to get size of 
# subset whose each pair sum is 
# not divisible by K 
  
# Returns maximum size of subset  
# with no pair sum divisible by K 
def subsetPairNotDivisibleByK(arr, N, K): 
  
    # Array for storing frequency  
    # of modulo values 
    f = [0 for i in range(K)] 
  
    # Fill frequency array with 
    # values modulo K 
    for i in range(N): 
        f[arr[i] % K] += 1
  
    # if K is even, then update f[K/2] 
    if (K % 2 == 0): 
        f[K//2] = min(f[K//2], 1) 
  
    # Initialize result by minimum of 1 or 
    # count of numbers giving remainder 0 
    res = min(f[0], 1) 
  
    # Choose maximum of count of numbers 
    # giving remainder i or K-i 
    for i in range(1,(K // 2) + 1): 
        res += max(f[i], f[K - i]) 
  
    return res 
      
# Driver Code 
arr = [3, 7, 2, 9, 1] 
N = len(arr) 
K = 3
print(subsetPairNotDivisibleByK(arr, N, K)) 
  
# This code is contributed by Anant Agarwal. 

