

# Python3 program find the maximum sum of 
# digits of the product of two numbers 
import sys 
  
# Function to find the sum of the digits 
def sumDigits(n): 
  
    digit_sum = 0; 
    while (n > 0):  
        digit_sum += n % 10; 
        n /= 10; 
      
    return digit_sum; 
  
# Function to find the maximum sum 
# of digits of product 
def productOfNumbers(arr, n): 
  
    sum = -sys.maxsize - 1; 
  
    # Run nested loops 
    for i in range(n - 1):  
        for j in range(i + 1, n): 
            product = arr[i] * arr[j]; 
  
            # Find the maximum sum 
            sum = max(sum, sumDigits(product)); 
  
    # Return the required answer 
    return sum; 
  
# Driver code 
if __name__ == '__main__': 
  
    arr =[ 4, 3, 5 ]; 
  
    n = len(arr); 
  
    print(int(productOfNumbers(arr, n))); 
  
# This code contributed by PrinciRaj1992  

