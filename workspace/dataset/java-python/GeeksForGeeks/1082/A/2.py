

# Python program to count numbers in  
# a range that are divisible by all 
# array elements 
import math 
  
# Function to find the lcm of array 
def findLCM(arr, n): 
  
    lcm = arr[0]; 
  
    # Iterate in the array 
    for i in range(1, n - 1):  
  
        # Find lcm 
        lcm = (lcm * arr[i]) / math.gcd(arr[i], lcm); 
  
    return lcm; 
  
# Function to return the count of numbers 
def countNumbers(arr, n, l, r): 
  
    # Function call to find the 
    # LCM of N numbers 
    lcm = int(findLCM(arr, n)); 
      
    # Return the count of numbers 
    count = (r / lcm) - ((l - 1) / lcm); 
    print(int(count)); 
  
# Driver Code 
arr = [1, 4, 2]; 
n = len(arr); 
l = 1; 
r = 10; 
  
countNumbers(arr, n, l, r); 
  
# This code is contributed  
# by Shivi_Aggarwal 

