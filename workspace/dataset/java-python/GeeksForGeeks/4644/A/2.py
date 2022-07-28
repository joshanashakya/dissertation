

# Python program to 
# find sum of series. 
  
def sumOfSeries(n) : 
  
    res = 0.0
    sum = 0
    prod = 1
    for i in range(1, n + 1) : 
      
        sum = sum + i 
        prod = prod * i 
        res = res + (sum / prod) 
          
    return res 
      
# Driver Code 
n = 4
print (round(sumOfSeries(n), 5))  
  
# This code is contributed by  
# Manish Shaw(manishshaw1) 

