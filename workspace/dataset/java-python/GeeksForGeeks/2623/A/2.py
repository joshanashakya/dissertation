

# Python3 program for the above approach 
  
# Function to find Nth term 
def findNthTerm(N): 
    ans = 0; 
  
    # Check if N is even 
    if (N % 2 == 0): 
  
        # Formula for n is even 
        ans = (N // 2) * 6 + (N // 2) * 2; 
      
    # Check if N is odd 
    else: 
          
        # Formula for N is odd 
        ans = (N // 2 + 1) * 6 + (N // 2) * 2; 
      
    # Print ans 
    print(ans); 
      
# Driver Code 
if __name__ == '__main__': 
      
    N = 3; 
    findNthTerm(N); 
      
# This code is contributed by Rajput-Ji 

