

# Python3 program to find the minimum  
# number of changes required to make  
# the given array an AP with common  
# difference d  
  
# Function to find the minimum number  
# of changes required to make the given  
# array an AP with common difference d  
def minimumChanges(arr, n, d): 
    maxFreq = -2147483648
      
    # dictionary to store  
    # frequency of a0 
    freq = {} 
      
    # storing frequency of a0 for  
    # all possible values of a[i]  
    # and finding the maximum' 
    # frequency 
    for i in range(n): 
        a0 = arr[i] - i * d 
          
        # increment frequency by 1 
        if a0 in freq: 
            freq[a0] += 1
        else: 
            freq[a0] = 1
              
        # finds count of most  
        # frequent number 
        if freq[a0] > maxFreq: 
            maxFreq = freq[a0] 
              
    # minimum number of elements  
    # needed to be changed is: 
    # n - (maximum frequency of a0)  
    return (n-maxFreq) 
  
# Driver Code 
  
# number of terms in ap  
n = 5
  
# difference in AP 
d = 1
arr = [1, 3, 3, 4, 6 ]  
ans = minimumChanges(arr, n, d) 
print(ans) 
  
# This code is contributed  
# by sahil shelangia 

