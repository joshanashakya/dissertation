

# Python program to find the sum of given series. 
  
  
# Function to calculate sum 
def solve_sum(n): 
    # Return sum 
    return (pow(10, n + 1)*(9 * n - 1)+10)/pow(9, 3)-n*(n + 1)/18
  
# driver code 
n = 3
  
print(int(solve_sum(n))) 

