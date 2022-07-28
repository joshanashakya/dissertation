

# A simple recursive program to find n-th 
# leonardo number. 
  
def leonardo(n) : 
    if (n == 0 or n == 1) : 
        return 1
    return (leonardo(n - 1) + leonardo(n - 2) + 1); 
      
      
# Driver code     
print(leonardo(3)) 
  
# This code is contributed by Nikita Tiwari. 

