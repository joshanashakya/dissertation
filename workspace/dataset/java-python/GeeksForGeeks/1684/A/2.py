

# Python3 code implementation of the above program 
  
# Function to count the number of ways  
def ways(n) : 
      
    # If there is a single number left  
    # it will form singleton  
    if (n == 1) : 
        return 1;  
      
    # if there are just 2 numbers left,  
    # they will form a pair  
    if (n == 2) : 
        return 2;  
      
    else : 
        return ways(n - 1) + ways(n - 2);  
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 5;  
  
    print("Number of ways = ", ways(n));  
  
# This code is contributed by AnkitRai01 

