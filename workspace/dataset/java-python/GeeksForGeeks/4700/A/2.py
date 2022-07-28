

# Python program to find 
# nth Cake number 
  
# Function to calculate 
# Cake number 
def number_cake(n): 
  
    # Formula to calculate nth 
    # Cake number 
      
    return (n * n * n + 5 * n + 6) // 6
  
# Driver Code 
n = 2
print(number_cake(n)) 
  
n = 8
print(number_cake(n)) 
  
n = 25
print(number_cake(n)) 
                      
# This code is contributed by aj_36                  

