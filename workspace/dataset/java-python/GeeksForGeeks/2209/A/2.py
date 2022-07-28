

# A Simple python3 program to count  
# number of ways to represent a number 
# n as sum of four. 
  
# Returns count of ways 
def countWays(n): 
  
    counter = 0 # Initialize result 
  
    # Generate all possible quadruplet  
    # and increment counter when sum of 
    # a quadruplet is equal to n 
    for i in range(1, n): 
        for j in range(i, n): 
            for k in range(j, n): 
                for l in range(k, n): 
                    if (i + j + k + l == n): 
                        counter += 1
    return counter 
  
# Driver Code 
if __name__ == "__main__": 
  
    n = 8
    print (countWays(n)) 
  
# This code is contributed by ita_c 

