

# Python3 implementation of the approach 
  
# Function to return the count of required pairs 
def countPairs(n): 
      
    # Special case 
    if (n == 2): 
        return 4
  
    # Number which will give the max value 
    # for ((n % i) % j) % n 
    num = ((n // 2) + 1); 
  
    # To store the maximum possible value  
    # of ((n % i) % j) % n 
    max = n % num; 
  
    # Count of possible pairs 
    count = n - max; 
  
    return count 
  
# Driver code 
if __name__ =="__main__" : 
  
    n = 5; 
print(countPairs(n)); 
  
# This code is contributed by Code_Mech 

