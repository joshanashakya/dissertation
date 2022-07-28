

# Python3 program to find the sum of  
# all multiples of 3 and 7 below N 
  
# Function to find sum of AP series 
def sumAP(n, d): 
      
    # Number of terms 
    n = int(n / d); 
  
    return (n) * (1 + n) * (d / 2); 
  
# Function to find the sum of all 
# multiples of 3 and 7 below N 
def sumMultiples(n): 
  
    # Since, we need the sum of 
    # multiples less than N 
    n -= 1; 
  
    return int(sumAP(n, 3) + 
               sumAP(n, 7) - 
               sumAP(n, 21)); 
  
# Driver code 
n = 24; 
  
print(sumMultiples(n)); 
  
# This code is contributed  
# by mits 

