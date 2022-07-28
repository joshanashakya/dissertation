

# Python program to find nth  
# Centered tetrahedral number 
  
# Function to calculate 
# Centered tetrahedral number 
  
def centeredTetrahedralNumber(n): 
  
    # Formula to calculate nth 
    # Centered tetrahedral number 
    # and return it into main function 
      
    return (2 * n + 1) * (n * n + n + 3) // 3
  
# Driver Code 
n = 6
print(centeredTetrahedralNumber(n)) 
                      
# This code is contributed by ajit                  

