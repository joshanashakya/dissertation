

# Python3 implementation of the  
# above approach.  
  
# From math lib import log2 
from math import log2 
  
# This variable counts discarded 
# subsequences  
discard_count = 0
  
# Function to return a^n  
def power(a, n) : 
      
    if (n == 0) : 
        return 1
          
    p = power(a, n // 2) 
    p = p * p 
    if (n & 1) : 
        p = p * a  
    return p  
  
# Recursive function that counts  
# discarded subsequences  
def solve(i, n, sum, k, a, prefix) : 
    global discard_count 
      
    # If at any stage, sum > k 
    # discard further subsequences 
    if (sum > k) : 
        discard_count += power(2, n - i) 
          
        # Recursive call terminated 
        # No further calls  
        return;  
      
    if (i == n) : 
        return
      
    # rem = Sum of array[i+1...n-1] 
    rem = prefix[n - 1] - prefix[i] 
      
    # If there are chances of discarding 
    # further subsequences then make a  
    # recursive call, otherwise not  
    # Including a[i] 
    if (sum + a[i] + rem > k) : 
        solve(i + 1, n, sum + a[i], k, a, prefix)  
      
    # Excluding a[i]  
    if (sum + rem > k) : 
        solve(i + 1, n, sum, k, a, prefix) 
  
# Function to return count of non-empty  
# subsequences whose product doesn't  
# exceed k  
def countSubsequences(arr, n, K) : 
      
    sum = 0.0
  
    # Converting k to log(k)  
    k = log2(K) 
  
    # Prefix sum array and array to  
    # store log values.  
    prefix = [0] * n 
    a = [0] * n 
  
    # a[] is the array obtained after  
    # converting numbers to logarithms  
    for i in range(n) :  
        a[i] = log2(arr[i])  
        sum += a[i] 
      
    # Computing prefix sums  
    prefix[0] = a[0] 
      
    for i in range(1, n) :  
        prefix[i] = prefix[i - 1] + a[i] 
  
    # Calculate non-empty subsequences  
    # hence 1 is subtracted  
    total = power(2, n) - 1
  
    # If total sum is <= k, then  
    # answer = 2^n - 1  
    if (sum <= k) :  
        return total 
  
    solve(0, n, 0.0, k, a, prefix) 
    return total - discard_count  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 4, 8, 7, 2 ]  
    n = len(arr) 
    k = 50;  
    print(countSubsequences(arr, n, k)) 
  
# This code is contributed by Ryuga 

