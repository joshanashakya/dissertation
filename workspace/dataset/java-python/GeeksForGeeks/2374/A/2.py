

# Python3 program to find the sum of  
# all multiples of 2 and 5 below N  
  
# Function to find sum of AP series  
def sumAP(n, d): 
  
    # Number of terms  
    n = int(n / d);  
  
    return (n) * (1 + n) * (d / 2);  
  
# Function to find the sum of all  
# multiples of 2 and 5 below N  
def sumMultiples(n): 
  
    # Since, we need the sum of  
    # multiples less than N  
    n -= 1;  
  
    return (int(sumAP(n, 2) + sumAP(n, 5) - 
                              sumAP(n, 10)));  
  
# Driver code  
n = 20;  
  
print(sumMultiples(n));  
      
# This code is contributed by mits 

