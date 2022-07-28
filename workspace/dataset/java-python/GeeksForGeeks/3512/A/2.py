

# Python program to count minimum  
# steps to reduce a number 
  
  
def countways(n): 
    if (n == 1): 
        return 0; 
    elif (n % 2 == 0): 
        return 1 + countways(n / 2); 
    else: 
        return 1 + min(countways(n - 1),  
                    countways(n + 1)); 
  
# Driver code 
n = 15; 
print(countways(n)); 
  
# This code is contributed by PrinciRaj1992 

