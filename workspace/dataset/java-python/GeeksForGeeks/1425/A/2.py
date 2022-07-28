

# Python program to find Nth 
# Centered pentagonal number. 
  
# Function to calculate 
# Centered pentagonal number. 
  
def centered_pentagonal_Num(n): 
  
    # Formula to calculate nth 
    # Centered pentagonal number. 
      
    return (5 * n * n - 5 * n + 2) // 2
  
# Driver Code 
n = 7
print("%sth Centered pentagonal number : " %n, 
                    centered_pentagonal_Num(n)) 
                      
# This code is contributed by ajit                  

