

# Python3 implementation of the approach 
  
import math 
# Function to print the required numbers 
def findNumbers(arr, n): 
      
  
        # Sum of first n natural numbers 
        sumN = (n * (n + 1)) / 2; 
  
        # Sum of squares of first n natural numbers 
        sumSqN = (n * (n + 1) * (2 * n + 1)) / 6; 
  
        # To store the sum and sum of squares 
        # of the array elements 
        sum = 0; 
        sumSq = 0; 
  
        for i in range(0,n):  
            sum = sum + arr[i]; 
            sumSq = sumSq + (math.pow(arr[i], 2)); 
          
  
        B = (((sumSq - sumSqN) / (sum - sumN)) + sumN - sum) / 2; 
        A = sum - sumN + B; 
        print("A = ",int(A)) ; 
        print("B = ",int(B)); 
      
  
# Driver code 
  
arr = [ 1, 2, 2, 3, 4 ]; 
n = len(arr); 
findNumbers(arr, n); 
  
#This code is contributed by Shivi_Aggarwal     

