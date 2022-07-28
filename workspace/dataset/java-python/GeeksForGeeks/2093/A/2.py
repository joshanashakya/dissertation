

# Python3 program to find the sum of  
# all the integers below N which are 
# multiples of either A or B  
  
# Function to find sum of AP series  
def sumAP(n, d): 
      
    # Number of terms  
    n = n//d  
  
    return (n) * (1 + n) * d // 2
  
# Function to find the sum of all  
# multiples of a and b below n  
def sumMultiples(n, a, b): 
  
    # Since, we need the sum of  
    # multiples less than N  
    n = n-1
    return sumAP(n, a) + sumAP(n, b) - \ 
                         sumAP(n, a * b)  
  
# Driver code  
n = 10
a = 3
b = 5
print(sumMultiples(n, a, b))  
  
# This code is contributed by Sanjit Prasad 

