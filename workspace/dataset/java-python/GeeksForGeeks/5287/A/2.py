

# Python program to find the sum of  
# series 1 - 2 + 3 - 4 +...... 
  
# Function to calculate sum 
def solve_sum(n): 
    # when n is odd 
    if(n % 2 == 1): 
        return (n + 1)/2
  
    # when n is not odd  
    return -n / 2
  
# Driver code 
n = 8
  
print(int(solve_sum(n))) 

