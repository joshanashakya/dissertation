

# Python3 program to check if the XOR 
# of an array is Even or Odd 
  
# Function to check if the XOR of 
# an array of integers is Even or Odd 
def check(arr, n): 
    count = 0; 
  
    for i in range(n): 
  
        # Count the number 
        # of odd elements 
        if (arr[i] & 1): 
            count = count + 1; 
      
    # If count of odd elements 
    # is odd, then XOR will be odd 
    if (count & 1): 
        return "Odd"; 
  
    # Else even 
    else: 
        return "Even"; 
  
# Driver Code 
if __name__=='__main__':  
  
    arr = [ 3, 9, 12, 13, 15 ] 
    n = len(arr) 
  
    # Function call 
    print(check(arr, n)) 
  
  
# This code is contributed by Princi Singh 

