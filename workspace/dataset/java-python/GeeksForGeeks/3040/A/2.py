

# Python3 implmentation to check if  
# the value of the N! % X^Y == 0 
      
# Function to check if N! % X^Y == 0  
def check(n, x, y) : 
    fact = 1; 
      
    # Loop to calculate N-factorial 
    for i in range(2, n + 1) : 
        fact *= i; 
    divisor = x ** y; 
          
    # Condition to check 
    if (fact % divisor == 0) : 
        print("YES"); 
    else : 
        print("NO");  
  
# Driver Code  
if __name__ == "__main__" :  
      
    n = 10;  
    x = 2;  
    y = 8;  
          
    # Function Call  
    check(n, x, y); 
  
# This code is contributed by Yash_R 

