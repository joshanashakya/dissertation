

# Pell Number Series using  
# Recursion in Python3 
  
# Calculate nth pell number 
def pell(n) : 
    if (n <= 2) : 
        return n 
    return (2 * pell(n - 1) + pell(n - 2)) 
      
# Driver function 
n = 4; 
print(pell(n)) 
  
# This code is contributed by Nikita Tiwari. 

