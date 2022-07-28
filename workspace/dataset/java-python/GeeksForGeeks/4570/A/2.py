

# Python3 implementation of the approach  
  
# Function to return the minimum required  
# absolute difference  
def minAbsDiff(n) : 
    mod = n % 4;  
  
    if (mod == 0 or mod == 3) : 
        return 0;  
  
    return 1;  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 5;  
    print(minAbsDiff(n))  
      
# This code is contributed by Ryuga 

