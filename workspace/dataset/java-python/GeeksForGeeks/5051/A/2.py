

# Python3 implementation of the approach  
  
# Function to find k such that  
# |a - k| = |b - k|  
def find_k(a, b) : 
  
    # If (a + b) is even  
    if ((a + b) % 2 == 0) :  
        return ((a + b) // 2);  
  
    return -1;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = 2; b = 16;  
  
    print(find_k(a, b));  
  
# This code is contributed by AnkitRai01 

