

# Python3 implmentation to find a  
# N-digit number such that the number  
# it is not divisible by its digits  
  
# Function to find the number  
# such that it is not divisible  
# by its digits  
def solve(n) :  
  
    # Base Cases  
    if (n == 1) : 
  
        print(-1);  
      
    else : 
          
        # First Digit of the  
        # number will be 2  
        num = 2;  
          
        # Next digits of the numbers  
        for i in range(n - 1) :  
            num = (num * 10) + 3;  
           
        print(num);  
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 4;  
      
    # Function Call  
    solve(n);  
      
# This code is contributed by AnkitRai01 

