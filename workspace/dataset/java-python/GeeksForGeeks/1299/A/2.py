

# Python3 implementation of the approach  
  
# Function to find the required fractions  
def find_numbers(N) : 
  
    # Base condition  
    if (N == 1) : 
        print(-1, end = "");  
  
    # For N > 1  
    else : 
        print(N, N + 1 , N * (N + 1));  
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 5;  
  
    find_numbers(N); 
      
# This code is contributed by AnkitRai01 

