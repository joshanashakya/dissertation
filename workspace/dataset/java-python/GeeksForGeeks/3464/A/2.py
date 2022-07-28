

   
# Python3 implementation of the approach 
  
# Function to return the minimum letters 
# required to make a total of n 
def minLettersNeeded(n):  
  
    if n % 26 == 0: 
        return (n//26) 
    else: 
        return ((n//26) + 1) 
  
# Driver code 
n = 52
print(minLettersNeeded(n)) 

