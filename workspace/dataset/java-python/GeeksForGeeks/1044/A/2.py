

# Python3 program to find the sum of 
# the addition of all possible subsets. 
last = 31
  
# Function to perform step-1 
def findSubset(temp, k): 
    global last 
    ans = [] 
  
    # Iterate from left till 0 
    # till we get a bit set of K numbers 
    for i in range(last, -1, -1): 
        cnt = 0
  
        # Count the numbers whose 
        # i-th bit is set 
        for it in temp: 
            bit = it & (1 << i) 
            if (bit > 0): 
                cnt += 1
  
        # If the array has numbers>=k 
        # whose i-th bit is set 
        if (cnt >= k): 
            for it in temp: 
                bit = it & (1 << i) 
                if (bit > 0): 
                    ans.append(it) 
  
            # Update last 
            last = i - 1
  
            # Return the new set of numbers 
            return ans 
  
    return ans 
  
# Function to find the maximum '&' value 
# of K elements in subsequence 
def findMaxiumAnd(a, n, k): 
    global last 
  
    # Temporary arrays 
    temp1, temp2, = [], [] 
  
    # Initially temp = arr 
    for i in range(n): 
        temp2.append(a[i]) 
  
    # Iterate till we have >=K elements 
    while len(temp2) >= k: 
  
        # Temp array 
        temp1 = temp2 
  
        # Find new temp array if 
        # K elements are there 
        temp2 = findSubset(temp2, k) 
  
    # Find the & value 
    ans = temp1[0] 
    for i in range(k): 
        ans = ans & temp1[i] 
  
    return ans 
  
# Driver Code 
a = [255, 127, 31, 5, 24, 37, 15] 
n = len(a) 
k = 4
  
print(findMaxiumAnd(a, n, k)) 
  
# This code is contributed by Mohit Kumar 

