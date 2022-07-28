

# Python implementation of the approach 
  
# Function to find the required sets 
def find_set(n): 
  
    # Impossible case 
    if (n <= 2): 
        print("-1"); 
        return; 
  
    # Sum of first n-1 natural numbers 
    sum1 = (n * (n - 1)) / 2; 
    sum2 = n; 
    print(sum1, " ", sum2); 
  
# Driver code 
n = 8; 
find_set(n); 
  
# This code is contributed by PrinciRaj1992 

