

# Python implementation of the approach 
  
# Function to compute the series sum 
def sum(x, n): 
    total = 1.0; 
  
    # To store the value of S[i-1] 
    previous = 1.0; 
  
    # Iterate over n to store sum in total 
    for i in range(1, n + 1): 
          
        # Update previous with S[i] 
        previous = (previous * x) / (i + 1); 
        total = total + previous; 
  
    return total; 
  
# Driver code 
if __name__ == '__main__': 
      
    # Get x and n 
    x = 5; 
    n = 4; 
  
    # Find and prthe sum 
    print("Sum is: ", sum(x, n)); 
  
# This code is contributed by 29AjayKumar 

