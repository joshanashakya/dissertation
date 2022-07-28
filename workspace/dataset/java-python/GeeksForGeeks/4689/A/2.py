

# Python program to  
# calculate 1^2+2^2+3^2+...  
# average of square number 
  
# Function to calculate  
# average of square number 
def AvgofSquareN(n) : 
  
    sum = 0
    for i in range(1, n + 1) : 
        sum += (i * i) 
    return sum/n 
  
# Driver code 
n = 2
print (AvgofSquareN(n)) 
      
# This code is contributed by  
# Manish Shaw(manishshaw1) 

