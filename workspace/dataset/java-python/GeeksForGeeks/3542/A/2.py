

# Python3 program to find minimum number of factorials 
  
# Array to calculate all factorials 
# less than or equal to N 
# Since there can be only 14 factorials 
# till 10^10 
# Hence the maximum size of fact[] is 14 
fact = [0]*14
  
# Store the actual size of fact[] 
size = 1
  
# Function to precompute factorials till N 
def preCompute(N): 
    global size 
      
    # Precomputing factorials 
    fact[0] = 1
  
    i = 1
  
    while fact[i - 1] <= N: 
        fact[i] = fact[i - 1] * i 
        size += 1
        i += 1
  
# Function to find the minimum number 
# of factorials whose sum represents N 
def findMin(N): 
  
    # Precompute factorials 
      
    preCompute(N) 
  
    originalN = N 
  
    # Initialize result 
    ans = [] 
  
    # Traverse through all factorials 
    for i in range(size-1, -1, -1): 
  
        # Find factorials 
        while (N >= fact[i]): 
            N -= fact[i] 
            ans.append(fact[i]) 
  
    # Prmin count 
    print(len(ans)) 
  
    # Prresult 
    for i in ans: 
        print(i, end=" ") 
  
# Driver program 
  
n = 27
findMin(n) 
  
# This code is contributed by mohit kumar 29 

