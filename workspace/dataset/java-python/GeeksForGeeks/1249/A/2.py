

# Python3 implementation of the above approach  
  
# Function to return the count of n-digit  
# natural hexadecimal numbers  
def count(n) :  
  
    return 15 * pow(16, n - 1);  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 2;  
    print(count(n)); 
      
# This code is contributed by AnkitRai01 

