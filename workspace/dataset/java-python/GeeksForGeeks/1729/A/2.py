

# Python program to find nth 
# Centered heptagonal number 
  
# Function to find Centered 
# heptagonal number 
def centered_heptagonal_num(n): 
  
    # Formula to calculate nth 
    # Centered heptagonal number 
    return (7 * n * n - 7 * n + 2) // 2
  
  
# Driver Code 
n = 5
print("%sth Centered heptagonal number : " %n, 
                    centered_heptagonal_num(n)) 

