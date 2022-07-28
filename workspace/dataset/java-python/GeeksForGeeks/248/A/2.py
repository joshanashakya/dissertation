

# Python3 progarm to find array 
# with K subarrays with sum S 
  
# Function to find array 
# with K subarrays with sum S 
def SubarraysWithSumS(n, k, s): 
    for i in range(k): 
        print(s, end=" ") 
    for i in range(k, n): 
        print(s + 1, end = " ") 
  
# Driver Code 
n = 4
k = 2
s = 3
  
# Function call 
SubarraysWithSumS(n, k, s) 
  
# This code is contributed by mohit kumar 29 

