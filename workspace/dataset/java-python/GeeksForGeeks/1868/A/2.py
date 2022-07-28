

# Python3 implementation of the approach  
  
# Function to compute number  
# using our deduced formula  
def findNumber(n) : 
      
    # Initialize num to n-1  
    num = n - 1; 
    num = 2 * (4 ** num); 
    num = num // 3; 
    return num;  
  
# Driver code  
if __name__ == "__main__" : 
      
    n = 5; 
    print(findNumber(n));  
      
# This code is contributed by AnkitRai01 

