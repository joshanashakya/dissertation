

# Python3 implementation of the approach 
from collections import defaultdict 
  
# Function to find the longest subsequence 
# having LCM less than or equal to K 
def findSubsequence(arr, n, k): 
  
    # Map to store unique elements 
    # and their frequencies 
    M = defaultdict(lambda:0) 
  
    # Update the frequencies 
    for i in range(0, n): 
        M[arr[i]] += 1
  
    # Array to store the count of numbers 
    # whom 1 <= X <= K is a multiple of 
    numCount = [0] * (k + 1) 
  
    # Check every unique element 
    for p in M:  
        if p <= k:  
  
            # Find all its multiples <= K 
            i = 1
            while p * i <= k:  
                  
                # Store its frequency 
                numCount[p * i] += M[p] 
                i += 1
          
        else: 
            break
      
    lcm, length = 0, 0
  
    # Obtain the number having maximum count 
    for i in range(1, k + 1):  
        if numCount[i] > length:  
            length = numCount[i] 
            lcm = i 
  
    # Condition to check if answer doesn't exist 
    if lcm == 0: 
        print(-1) 
    else: 
  
        # Print the answer 
        print("LCM = {0}, Length = {1}".format(lcm, length)) 
  
        print("Indexes = ", end = "") 
        for i in range(0, n): 
            if lcm % arr[i] == 0: 
                print(i, end = " ") 
      
# Driver code 
if __name__ == "__main__": 
  
    k = 14
    arr = [2, 3, 4, 5]  
    n = len(arr) 
  
    findSubsequence(arr, n, k) 
  
# This code is contributed by Rituraj Jain 

