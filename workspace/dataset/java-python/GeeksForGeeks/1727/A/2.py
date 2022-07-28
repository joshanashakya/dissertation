

# Python program to find nth 
# Centered square number. 
  
  
# Function to calculate Centered 
# square number function 
def centered_square_num(n): 
  
    # Formula to calculate nth 
    # Centered square number 
    return n * n + ((n - 1) * (n - 1)) 
  
  
# Driver Code 
n = 7
print("%sth Centered square number: " %n, 
                  centered_square_num(n)) 
     

