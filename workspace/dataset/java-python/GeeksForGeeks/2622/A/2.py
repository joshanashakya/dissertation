

# Python3 program for the above approach 
  
# Function to find Nth term 
def findNthTerm(N): 
    ans = 0
  
    # Iterate from 1 till Nth term 
    for i in range(N): 
  
        # Check if i is even and 
        # then add 6 
        if (i % 2 == 0) : 
            ans = ans + 6
          
  
        # Else add 2 
        else : 
            ans = ans + 2
          
    # Print ans 
    print(ans) 
  
  
# Driver Code 
if __name__=='__main__':  
  
    N = 3
    findNthTerm(N) 
      
  
# This code is contributed by AbhiThakur 

