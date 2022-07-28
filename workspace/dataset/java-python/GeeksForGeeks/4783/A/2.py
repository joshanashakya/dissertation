

# Program to find average 
# of odd numbers till a 
# given odd number. 
  
# Function to calculate  
# the average of odd  
# numbers 
def averageOdd(n) : 
  
    if (n % 2 == 0) : 
        print("Invalid Input") 
        return -1
      
    sm = 0
    count = 0
  
    while (n >= 1) : 
  
        # count odd numbers 
        count = count + 1
  
        # store the sum of  
        # odd numbers 
        sm = sm + n 
  
        n = n - 2
      
    return sm // count 
      
# Driver function 
n = 15
print(averageOdd(n)) 
  
# This code is contributed by Nikita Tiwari. 

