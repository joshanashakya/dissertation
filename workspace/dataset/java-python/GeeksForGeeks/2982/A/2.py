

# Python3 program to count the number  
# of subarrays that having 1 
  
# Function to find the smallest divisor 
def smallestDivisor(n): 
  
    # if divisible by 2 
    if (n % 2 == 0): 
        return 2; 
  
    # iterate from 3 to sqrt(n) 
    i = 3;  
    while(i * i <= n): 
        if (n % i == 0): 
            return i; 
        i += 2; 
  
    return n; 
  
  
# Driver Code 
n = 31; 
print(smallestDivisor(n)); 
  
# This code is contributed by mits 

