

# Python3 implementation of the approach 
  
# Function to return the sum of numbers  
# which are in the ration a:b and after  
# adding x to both the numbers  
# the new ratio becomes c:d 
def sum(a, b, c, d, x): 
  
    ans = ((x * (a + b) * (c - d)) / 
               ((a * d) - (b * c))); 
    return ans; 
  
# Driver code 
if __name__ == '__main__': 
  
    a, b, c, d, x = 1, 2, 9, 13, 5; 
      
    print(sum(a, b, c, d, x)); 
      
# This code is contributed by PrinciRaj1992  

