

# Python implementation to count  
# the occurence of a digit in  
# number using Recursion 
  
# Function to count the digit K 
# in the given number N 
def countdigits(n, k): 
    if n == 0: 
        return 0
           
    # Extracting least  
    # significant digit 
    digit = n % 10
       
    if digit == k: 
        return 1 + countdigits(n / 10, k) 
   
    return countdigits(n / 10, k) 
  
# Driver Code 
if __name__ == "__main__": 
    n = 1000; 
    k = 0; 
    print(countdigits(n, k)) 

