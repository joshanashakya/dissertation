

# Python program to find 
# nth dodecahedral number 
  
# Function to calculate 
# dodecahedral number 
  
def dodecahedral_num(n): 
  
    # Formula to calculate nth 
    # dodecahedral number 
      
    return n * (3 * n - 1) * (3 * n - 2) // 2
  
# Driver Code 
n = 5
print("%sth Dodecahedral number :" %n, 
                    dodecahedral_num(n)) 
                      
# This code is contributed by ajit.                  

