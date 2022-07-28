

# Python3 program to find the length of 
# the smallest subarray that must be 
# removed in order to maximise the GCD 
  
# Function to find the length of 
# the smallest subarray that must be 
# removed in order to maximise the GCD 
def GetMinSubarrayLength(a, n): 
  
    # Store the maximum possible 
    # GCD of the resulting subarray 
    ans = max(a[0], a[n - 1]) 
  
    # Two pointers initially pointing 
    # to the first and last element 
    # respectively 
    lo = 0
    hi = n - 1
  
    # Moving the left pointer to the 
    # right if the elements are 
    # divisible by the maximum GCD 
    while (lo < n and a[lo] % ans == 0): 
        lo += 1
  
    # Moving the right pointer to the 
    # left if the elements are 
    # divisible by the maximum GCD 
    while (hi > lo and a[hi] % ans == 0): 
        hi -= 1
  
    # Return the length of 
    # the subarray 
    return (hi - lo + 1) 
  
# Driver code 
if __name__ == '__main__': 
  
    arr = [4, 8, 2, 1, 4] 
    N = len(arr) 
  
    length = GetMinSubarrayLength(arr, N) 
  
    print(length) 
  
# This code is contributed by mohit kumar 29 

