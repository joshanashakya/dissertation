

# python 3 implementation to  
# find sum of even numbers 
# at even indices 
  
# Function to calculate sum  
# of even numbers at even indices 
def sum_even_and_even_index(arr,n): 
      
    i = 0
    sum = 0
      
# calculating sum of even 
# number at even index 
    for i in range(0,n,2): 
        if (arr[i] % 2 == 0) : 
            sum += arr[i] 
          
    # required sum 
    return sum
  
  
# Driver program to test above 
arr = [5, 6, 12, 1, 18, 8] 
n = len(arr) 
print("Sum of even numbers at ", 
             "even indices is ",  
   sum_even_and_even_index(arr, n)) 
      
# This code is contributed by Sam007 

