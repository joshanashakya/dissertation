

# python program to reverse a subarray 
# arr[0..k-1] 
from __future__ import print_function 
  
# Reverse subarray a[0..k-1] 
def reverse(a, n, k): 
      
    if (k > n): 
        print( "Invalid k") 
        return
      
    # One by one reverse first and 
    # last elements of a[0..k-1] 
    for i in range(0, (int)(k/2)): 
        temp = a[i] 
        a[i] = a[k-i-1] 
        a[k-i-1] = temp 
          
# Driver program 
a = [1, 2, 3, 4, 5, 6] 
n = len(a) 
k = 4
  
reverse(a, n, k); 
  
for i in range(0, n): 
    print(a[i], end=" ") 
      
# This code is contributed by Sam007. 

