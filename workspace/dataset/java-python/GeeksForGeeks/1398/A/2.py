

# Python3 program to find nth Hermite number 
  
# Function to return nth Hermite number 
def getHermiteNumber( n): 
  
    # Base conditions 
    if n == 0 : 
        return 1
    if n == 1 : 
        return 0
  
    else : 
        return (-2 * (n - 1) *
                getHermiteNumber(n - 2)) 
  
# Driver Code 
n = 6
  
# Print nth Hermite number 
print(getHermiteNumber(n)); 
  
# This code is contributed  
# by Arnab Kundu 

