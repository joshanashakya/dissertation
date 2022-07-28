

# Python 3 program to find 
# n-th term of 
# series 
   
       
# Function to find the 
# nth term of series 
def sumOfSeries(n) : 
    # Loop to add 4th powers 
    ans = 0
    for i in range(1, n + 1) : 
        ans = ans + i * i * i * i  
        
    return ans 
   
   
# Driver code 
n = 4
print(sumOfSeries(n)) 

