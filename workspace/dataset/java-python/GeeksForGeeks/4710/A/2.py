

# Python3 implementation of above approach 
  
# Function to calculate all the solutions 
def findsolution(n, x, y): 
  
    # there is no solutions 
    if ((y - n + 1) * (y - n + 1) +
              n - 1 < x or y < n): 
        print("No solution"); 
        return; 
  
    # print first element as y-n+1 
    print(y - n + 1); 
  
    # print rest n-1 elements as 1 
    while (n > 1): 
        print(1); 
        n -= 1; 
  
# Driver code 
  
# initialize the number of elements 
# and the value of x an y 
n = 5;  
x = 15;  
y = 15; 
  
findsolution(n, x, y); 
  
# This code is contributed by mits 

