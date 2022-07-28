

# Python3 implementation of the approach 
  
# Function that returns true if n  
# contains digit m exactly k times 
def digitWell(n, m, k): 
  
    cnt = 0
    while (n > 0): 
  
        if (n % 10 == m): 
            cnt = cnt + 1; 
        n = (int)(n / 10); 
  
    return cnt == k; 
  
# Function to return the smallest integer > n  
# with digit m occurring exactly k times 
def findInt(n, m, k): 
  
    i = n + 1; 
  
    while (True):  
        if (digitWell(i, m, k)): 
            return i; 
        i = i + 1; 
  
# Driver code 
n = 111; m = 2; k = 2; 
print(findInt(n, m, k)); 
  
# This code is contributed  
# by Akanksha Rai 

