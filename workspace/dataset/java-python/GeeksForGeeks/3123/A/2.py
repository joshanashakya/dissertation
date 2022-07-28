

# Python3 implementation of the 
# above approach  
  
# Function to count the perfect squares  
def countOddSquares(n, m) :  
    return (int(pow(m, 0.5)) - 
            int(pow(n - 1, 0.5)))  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 5 ; m = 100;  
    print("Count is", (m - n + 1) - 
                       countOddSquares(n, m))  
      
# This code is contributed by Ryuga 

