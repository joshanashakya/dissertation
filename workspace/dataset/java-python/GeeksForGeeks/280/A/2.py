

# Python3 program to find the maximum 
# number of equal numbers in an array 
  
# Function to find the maximum  
# number of equal numbers in an array 
def EqualNumbers(a, n): 
  
    # to store sum of elements 
    sum = 0; 
    for i in range(n): 
        sum += a[i]; 
  
    # if sum of numbers is not  
    # divisible by n 
    if (sum % n): 
        return n - 1; 
  
    return n; 
  
# Driver Code 
a = [1, 4, 1 ]; 
  
# size of an array 
n = len(a); 
  
print(EqualNumbers(a, n)); 
  
# This code is contributed by mits 

