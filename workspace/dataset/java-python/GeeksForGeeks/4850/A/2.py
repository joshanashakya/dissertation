

# Python program to find Nth 
# hexadecagon number 
  
# Function to calculate 
# hexadecagonal number 
def hexadecagonalNum(n): 
  
    # Formula to calculate nth 
    # Centered heptagonal number 
    return ((14 * n * n) - 12 * n) // 2
  
# Driver Code 
n = 5
print("%sth Hexadecagonal number : " %n, 
                    hexadecagonalNum(n)) 
n = 9
print("%sth Hexadecagonal number : " %n, 
                    hexadecagonalNum(n)) 
                      
# This code is contributed by ajit                  

