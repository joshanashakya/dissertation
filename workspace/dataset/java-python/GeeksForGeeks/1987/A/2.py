

# Python3 program to find count of integers  
# needed to express all numbers from 1 to N.  
  
# function to count length of  
# binary expression of n  
def countBits(n): 
  
    count = 0;  
    while (n): 
        count += 1;  
        n >>= 1; 
          
    return count;  
  
# Driver code  
n = 32;  
print("Minimum value of K is =",  
                  countBits(n));  
  
# This code is contributed by mits 

