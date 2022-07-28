

# Python3 implementation of the approach 
  
# Function to return the count of 
# odd numbers in the array 
def countOdd(arr, n): 
  
    # Variable to count odd numbers 
    odd = 0; 
  
    for i in range(0, n):  
  
        # Odd number 
        if (arr[i] % 2 == 1): 
            odd = odd + 1; 
      
    return odd; 
  
# Function to return the count  
# of valid pairs 
def countValidPairs(arr, n): 
  
    odd = countOdd(arr, n); 
  
    return (odd * (odd - 1)) / 2; 
  
# Driver Code 
arr = [1, 2, 3, 4, 5 ]; 
n = len(arr); 
print(int(countValidPairs(arr, n))); 
      
# This code is contributed by 
# Shivi_Aggarwal 

