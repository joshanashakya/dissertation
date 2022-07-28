

# Python3 implementation of the approach 
  
# Function to find the arcsin(x) 
def find_Solution(x, n): 
    Sum = x 
    e = 2
    o = 1
    p = 1
    for i in range(2, n + 1): 
  
        # The power to which 'x' is raised 
        p += 2
  
        Sum += (o / e) * (pow(x, p) / p) 
  
        # Numerator value 
        o = o * (o + 2) 
  
        # Denominator value 
        e = e * (e + 2) 
    print(round(Sum, 10)) 
  
# Driver code 
x = -0.5
  
if (abs(x) >= 1): 
    print("Invalid Input\n") 
  
n = 8
find_Solution(x, n) 
  
# This code is contributed by Mohit Kumar 

