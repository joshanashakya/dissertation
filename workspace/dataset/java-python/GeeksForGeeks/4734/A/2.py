

# Python3 program to find number  
# of set bist in a number 
  
# Recursive function to find  
# number of set bist in a number 
def CountSetBits(n): 
      
    # Base condition 
    if (n == 0): 
        return 0; 
          
    # If Least signifiant bit is set 
    if((n & 1) == 1): 
        return 1 + CountSetBits(n >> 1); 
      
    # If Least signifiant bit is not set 
    else: 
        return CountSetBits(n >> 1); 
  
# Driver code 
if __name__ == '__main__': 
    n = 21; 
      
    # Function call 
    print(CountSetBits(n)); 
  
# This code is contributed by 29AjayKumar  

