

# Python 3 program to Find number of 
# Triplets 1 <= a <= b<= c <= n, 
# Such that a^2 + b^2 = c^2 
import math 
  
# function to ind number of 
# Triplets 1 <= a <= b<= c <= n, 
# Such that a^2 + b^2 = c^2 
def Triplets(n): 
  
    # to store required answer 
    ans = 0
  
    # run nested loops for first two numbers. 
    for i in range(1, n + 1): 
        for j in range(i, n + 1): 
            x = i * i + j * j 
  
            # third number 
            y = int(math.sqrt(x)) 
  
            # check if third number is perfect 
            # square and less than n 
            if (y * y == x and y <= n): 
                ans += 1
    return ans 
  
# Driver code 
if __name__ == "__main__": 
    n = 10
  
    # function call 
    print(Triplets(n)) 
  
# This code is contributed 
# by ChitraNayal 

