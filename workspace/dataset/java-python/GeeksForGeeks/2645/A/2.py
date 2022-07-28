

# Python3 Program to find sum of  
# squares of Fibonacci numbers  
  
# Function to calculate sum of  
# squares of Fibonacci numbers  
def calculateSquareSum(n): 
    fibo = [0] * (n + 1); 
    if (n <= 0): 
        return 0; 
    fibo[0] = 0; 
    fibo[1] = 1; 
      
    # Initialize result 
    sum = ((fibo[0] * fibo[0]) + 
           (fibo[1] * fibo[1])); 
      
    # Add remaining terms 
    for i in range(2, n + 1): 
        fibo[i] = (fibo[i - 1] + 
                   fibo[i - 2]); 
        sum += (fibo[i] * fibo[i]); 
  
    return sum;  
  
# Driver Code 
n = 6;  
  
print("Sum of squares of Fibonacci numbers is :", 
                          calculateSquareSum(n));  
  
# This Code is contributed by mits 

