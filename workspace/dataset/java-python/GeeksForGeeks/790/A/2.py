

# Python3 implementation of the approach  
  
# Function to return the required sum  
def getSum(n, d) : 
    sum = 0;  
    for i in range(n + 1) :  
  
        # If the unit digit is d  
        if (i % 10 == d) : 
            sum += i  
    return sum
  
# Driver code  
if __name__ == "__main__" : 
  
    n , d = 30, 3
    print(getSum(n, d)) 
  
# This code is contributed by Ryuga 

