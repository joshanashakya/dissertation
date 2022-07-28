

# Python3 implementation of the approach  
  
# Function to return the number of ways  
# to insert the bracket pairs  
def cntWays(string, n) : 
  
    x = n + 1;  
    ways = x * x * (x * x - 1) // 12;  
    return ways;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "ab";  
    n = len(string);  
  
    print(cntWays(string, n));  
  
# This code is contributed by AnkitRai01 

