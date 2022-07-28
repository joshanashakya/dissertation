

# Python program to find the  
# sum of given series 
  
# Function to calculate sum 
def findSum(n): 
    # Return sum 
    return (n*(pow(n, 2)+3 * n + 5))/3
  
# driver code 
n = 25
  
print(int(findSum(n))) 

