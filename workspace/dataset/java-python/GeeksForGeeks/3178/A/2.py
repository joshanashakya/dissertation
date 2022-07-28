

# Python3 program to calculate the sum of all 
# palindromic numbers in array 
  
# Function to reverse a number n 
def reverse(n) : 
      
    d = 0; s = 0; 
  
    while (n > 0) : 
  
        d = n % 10; 
        s = s * 10 + d; 
        n = n // 10; 
  
    return s; 
      
  
# Function to check if a number n is 
# palindrome 
def isPalin(n) : 
  
    # If n is equal to the reverse of n 
    # it is a palindrome 
    return n == reverse(n); 
  
  
# Function to calculate sum of all array 
# elements which are palindrome 
def sumOfArray(arr, n) : 
    s = 0; 
      
    for i in range(n) : 
        if ((arr[i] > 10) and isPalin(arr[i])) : 
          
            # summation of all palindrome numbers 
            # present in array 
            s += arr[i]; 
              
    return s; 
   
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 6; 
  
    arr = [ 12, 313, 11, 44, 9, 1 ]; 
  
    print(sumOfArray(arr, n)); 
     
    # This code is contributed by AnkitRai01 

