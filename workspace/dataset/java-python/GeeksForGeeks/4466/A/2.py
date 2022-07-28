

# Python 3 implementation of the approach 
def count(n): 
    count = 0
    while (n):  
        count += n & 1
        n >>= 1
    return count 
  
# Function to find the count 
# of set bits in all the 
# integers from 0 to n 
def findSetBits(n): 
    for i in range(n + 1): 
        print(count(i), end = " ") 
      
# Driver code 
if __name__ == '__main__': 
    n = 5
  
    findSetBits(n) 
  
# This code is contributed by Surendra_Gangwar 

