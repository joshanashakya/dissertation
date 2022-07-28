

# Python3 program to find minimum  
# and maximum no. of pairs 
  
from math import ceil 
  
def MinimumMaximumPairs(n, m) : 
  
    max_pairs = ((n - m + 1) * (n - m)) // 2; 
  
    min_pairs = (m * (((n - m) // m + 1) * 
                      ((n - m) // m)) // 2 +
                  ceil((n - m) / (m)) *
                      ((n - m) % m)) 
  
    print("Minimum no. of pairs = ", min_pairs) 
    print("Maximum no. of pairs = " , max_pairs) 
  
# Driver code 
if __name__ == "__main__" : 
  
    n ,m= 5, 2
    MinimumMaximumPairs(n, m) 
  
# This code is contributed by Ryuga 

