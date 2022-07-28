

# Python3 implementation of the approach 
MAX = 100001; 
  
prefix = [0] * MAX; 
  
# Function to calculate the prefix sum 
# of all the odd factors 
def sieve_modified(): 
  
    for i in range(1, MAX, 2): 
  
        # Add i to all the multiples of i 
        for j in range(i, MAX, i): 
            prefix[j] += i; 
  
    # Update the prefix sum 
    for i in range(1, MAX): 
        prefix[i] += prefix[i - 1]; 
  
# Function to return the sum of 
# all the odd factors of the 
# numbers in the given range 
def sumOddFactors(L, R): 
  
    return (prefix[R] - prefix[L - 1]); 
  
# Driver code 
sieve_modified(); 
l = 6; 
r = 10; 
print(sumOddFactors(l, r)); 
  
# this code is contributed by chandan_jnu 

