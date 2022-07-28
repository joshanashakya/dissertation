

# Python3 program to find maximum possible 
# elements which divisible by 2 
  
# Function to find maximum possible 
# elements which divisible by 2 
def Divisible(arr, n): 
    # To store count of even numbers 
    count_even = 0
  
    for i in range(n): 
        if (arr[i] % 2 == 0): 
            count_even+=1
  
    # All even numbers and half of odd numbers 
    return count_even + (n - count_even) // 2
  
# Driver code 
  
arr=[1, 2, 3, 4, 5] 
  
n = len(arr) 
  
# Function call 
print(Divisible(arr, n)) 
  
# This code is contribute by mohit kumar 29 

