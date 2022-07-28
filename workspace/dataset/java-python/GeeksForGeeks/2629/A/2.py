

# Python program to find the Nth  
# term in series 
   
# Function to print nth term  
# of series  
def sumOfSeries(n): 
    return n * (n + 1) * (6 * n * n * n  
                 + 9 * n * n + n - 1)/ 30
       
# Driver code  
n = 4
print sumOfSeries(n) 

