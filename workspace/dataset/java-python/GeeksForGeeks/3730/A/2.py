

# Python3 implementation of the approach 
  
# Function to whether the array 
# can be made zero or not 
def check(arr, N): 
      
    # Count for even elements 
    even = 0; 
  
    # Count for odd elements 
    odd = 0; 
  
    # Traverse the array to 
    # count the even and odd 
    for i in range(N): 
  
        # If arr[i] is odd 
        if (arr[i] % 2 == 1): 
            odd += 1; 
      
        # If arr[i] is even 
        else: 
            even += 1; 
  
    # Check if count of even 
    # is zero or count of odd 
    # is zero 
    if (even == N or odd == N): 
        print("Yes"); 
    else: 
        print("No"); 
  
# Driver's Code 
if __name__ == '__main__': 
    arr = [ 1, 1, 3]; 
    N = len(arr); 
  
    check(arr, N); 
  
# This code is contributed by 29AjayKumar 

