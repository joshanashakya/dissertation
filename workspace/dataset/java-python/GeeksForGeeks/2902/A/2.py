

# Python 3 program to find distinct integers 
# ontained by lcm(x, num)/x 
  
import math 
  
# Function to count the number of distinct 
# integers ontained by lcm(x, num)/x 
def numberOfDistinct(n): 
    ans = 0
  
    # iterate to count the number of factors 
    for i in range( 1, int(math.sqrt(n))+1): 
        if (n % i == 0) : 
            ans += 1
            if ((n // i) != i): 
                ans += 1
    return ans 
  
# Driver Code 
if __name__ == "__main__": 
    n = 3
  
    print(numberOfDistinct(n)) 
  
# This code is contributed by 
# ChitraNayal 

