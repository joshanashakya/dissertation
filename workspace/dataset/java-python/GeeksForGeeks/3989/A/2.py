

# Python3 implementation of the approach 
  
# Function to count the number 
# of factors P in X! 
def countFactor(P, X): 
    if (X < P): 
        return 0; 
  
    return (X // P + countFactor(P, X // P)); 
  
# Function to find the smallest X such 
# that X! contains Y trailing zeros 
def findSmallestX(Y): 
  
    low = 0; 
    high = 5 * Y; 
    N = 0; 
    while (low <= high): 
        mid = (high + low) // 2; 
  
        if (countFactor(5, mid) < Y): 
            low = mid + 1; 
  
        else: 
            N = mid; 
            high = mid - 1; 
  
    return N; 
  
# Driver code 
Y = 10; 
  
print(findSmallestX(Y)); 
  
# This code is contributed by mits 

