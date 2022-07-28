

# Python3 implementation of the approach  
  
# Function to find the numbers from  
# the given arrays such that their  
# sum is not present in any  
# of the given array  
def findNum(a, n, b, m) : 
  
    # Find the maximum element  
    # from both the arrays  
    x = max(a);  
    y = max(b);  
    print(x, y);  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 3, 2, 2 ]; 
    n = len(a);  
      
    b = [ 1, 5, 7, 7, 9 ];  
    m = len(b);  
  
    findNum(a, n, b, m); 
  
# This code is contributed by AnkitRai01 

