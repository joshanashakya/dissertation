

# Python3 program to implement the above approach 
  
# Function to Count of pairs (A, B) in range 1 to N 
def pairs(n): 
    c = [[0 for i in range(10)] for i in range(10)] 
  
    tmp = 1
  
    # count C i, j 
    for i in range(1, n + 1): 
        if (i >= tmp * 10): 
            tmp *= 10
        c[i // tmp][i % 10] += 1
  
    # Calculate number of pairs 
    ans = 0
    for i in range(1, 10): 
        for j in range(1, 10): 
            ans += c[i][j] * c[j][i] 
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    n = 25
  
    # Function call 
    print(pairs(n)) 
  
# This code is contributed by mohit kumar 29     

