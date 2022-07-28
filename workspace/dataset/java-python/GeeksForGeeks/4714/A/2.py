

# Python3 implementation of the approach  
  
# Function to return the factorial of n  
def factorial(n) :  
  
    if (n == 0) : 
        return 1;  
    return n * factorial(n - 1);  
  
# Function to return the count  
# of n-digit numbers with  
# all distinct digits  
def countNum(n) : 
    if (n > 10) :  
        return 0;  
          
    return (9 * factorial(9) // 
                factorial(10 - n));  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 3;  
  
    print(countNum(n));  
      
# This code is contributed by AnkitRai01 

