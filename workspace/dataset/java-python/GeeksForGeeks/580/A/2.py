

# Python3 code of above approach  
  
# Find the probability that a  
# n digit number is palindrome  
def solve(n) :  
  
    n_2 = n // 2;  
  
    # Denominator  
    den = "1";  
  
    # Assign 10^(floor(n/2)) to  
    # denominator  
    while (n_2) :  
        den += '0';  
          
        n_2 -= 1
          
    # Display the answer 
    print(str(1) + "/" + str(den)) 
      
# Driver code  
if __name__ == "__main__" :  
  
    N = 5;  
  
    solve(N);  
  
# This code is contributed by AnkitRai01 

