

# Python3 program to find relation independent of l 
# length of the given pencil, for how much one 
# can write from n pencils. 
  
# Function to find no of pencils 
def count(n): 
    x = (n // 3) - 1; 
    if (n % 3 > 0): 
        x+=1; 
      
    return (4 * x + 4 * n); 
  
# Driver code 
if __name__ == '__main__': 
    n = 5; 
    print(count(n)); 
      
# This code is contributed by PrinciRaj1992 

