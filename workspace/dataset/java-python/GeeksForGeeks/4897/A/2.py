

# Python3 implementation of the approach 
  
# Function to return  
# minimum number of nodes 
def AVLtree(H, a, b): 
      
    # Base Conditions 
    if(H == 0): 
        return 1; 
    if(H == 1): 
        return b; 
  
    # Tail Recursive Call 
    return AVLtree(H - 1, b, a + b + 1); 
  
# Driver Code 
if __name__ == '__main__': 
    H = 5; 
    answer = AVLtree(H, 1, 2); 
  
    # Output the result 
    print("n(", H , ") = "\ 
        , answer); 
  
# This code is contributed by 29AjayKumar 

