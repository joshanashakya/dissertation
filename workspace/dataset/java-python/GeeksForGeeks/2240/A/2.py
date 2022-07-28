

# Python 3 implementation of the approach  
  
# Function to return the  
# required number of ways  
def cntWays(n) :  
    if n % 2 == 1 :  
        return 0
    else: 
        return (n - 2) // 4
          
# Driver code  
n = 18
print(cntWays(n)) 
  
# This code is contributed by 
# divyamohan123 

