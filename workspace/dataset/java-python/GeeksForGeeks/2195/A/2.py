

# Python3 implementation of the approach 
  
# Function to return the smallest sum  
# of 2 n-digit numbers  
def smallestSum(n): 
   
    if (n == 1): 
        return 0
    return (2 * pow(10, n - 1)) 
  
# Function to return the largest sum  
# of 2 n-digit numbers  
def largestSum(n): 
    return (2 * (pow(10, n) - 1)) 
  
# Driver code 
n = 4
print("Largest = ", largestSum(n)) 
print("Smallest = ", smallestSum(n)) 

