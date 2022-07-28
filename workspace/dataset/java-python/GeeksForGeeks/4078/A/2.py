

# Python 3 program to partition N into M parts 
# such that difference Max and Min 
# part is the smallest 
  
# Function to partition N into M parts such 
# that difference Max and Min part 
# is smallest 
def printPartition(n, m): 
    k = int(n / m) 
    # Minimum value 
  
    ct = n % m 
    # Number of (K+1) terms 
  
    for i in range(1,ct+1,1): 
        print(k + 1,end= " ") 
    count = i 
    for i in range(count,m,1): 
        print(k,end=" ") 
  
# Driver Code 
if __name__ == '__main__': 
    n = 5
    m = 2
    printPartition(n, m) 
  
# This code is contributed by 
# Surendra_Gangwar 

