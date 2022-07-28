

# Python3 program to find length of the longest  
# subarray with all fibonacci numbers  
  
N = 100000 
  
# Function to create hash table  
# to check for Fibonacci numbers  
def createHash(hash, maxElement) : 
  
    # Insert first two fibnonacci numbers  
    prev = 0
    curr = 1 
  
    hash.add(prev)  
    hash.add(curr)  
  
    while (curr <= maxElement) : 
  
        # Summation of last two numbers  
        temp = curr + prev  
  
        hash.add(temp)  
  
        # Update the variable each time  
        prev = curr  
        curr = temp  
  
# Function to find the  
# longest fibonacci subarray   
def longestFibSubarray(arr, n) : 
  
    # Find maximum value in the array  
    max_val = max(arr) 
  
    # Creating a set  
    # containing Fibonacci numbers  
    hash = {int} 
  
    createHash(hash, max_val)  
  
    left = [ 0 for i in range(n)] 
  
    right = [ 0 for i in range(n)] 
  
    fibcount = 0
    res = -1 
  
    # Left array is used to count number of  
    # continuous fibonacci numbers starting  
    # from left of current element  
    for i in range(n) : 
  
        left[i] = fibcount  
  
        # Check if current element  
        # is a fibonacci number  
        if (arr[i] in hash) : 
            fibcount += 1
        else: 
            fibcount = 0 
  
    # Right array is used to count number of  
    # continuous fibonacci numbers starting  
    # from right of current element  
    fibcount = 0 
  
    for i in range(n-1,-1,-1) : 
  
        right[i] = fibcount  
  
        # Check if current element  
        # is a fibonacci number  
        if (arr[i] in hash) : 
            fibcount += 1
        else: 
            fibcount = 0 
  
    for i in range(0,n) :  
        res = max(res, left[i] + right[i])  
  
    return res 
  
# Driver code  
arr = [ 2, 8, 5, 7, 3, 5, 7 ]  
n = len(arr) 
print(longestFibSubarray(arr, n)) 
  
# This code is contributed by Sanjit_Prasad 

