

# Python3 implementation of the approach  
MOD = 1000000007
  
# Function to return (m! % MOD)  
def modFact(n, m) : 
      
    result = 1
    for i in range(1, m + 1) :  
        result = (result * i) % MOD  
  
    return result  
  
# Driver code  
n = 3
m = 2
  
print(modFact(n, m))  
  
# This code is contributed by 
# divyamohan123 

