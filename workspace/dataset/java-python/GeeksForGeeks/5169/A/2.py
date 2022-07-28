

# Python3 Program to copy one String to  
# another using Recursion  
  
# Function to copy one string in to other  
# using recursion  
def myCopy(s1, s2, index): 
      
    # copying each character from s1 to s2  
    s2[index] = s1[index]; 
  
    # if string reach to end then stop  
    if (index == len(s1) - 1): 
        return; 
  
    # increase character index by one  
    myCopy(s1, s2, index + 1); 
  
# Driver Code  
if __name__ == '__main__': 
    s1 = "GEEKSFORGEEKS"; 
    s2 = [0] * (len(s1)); 
    index = 0; 
    myCopy(s1, s2, index); 
    print("".join(s2)); 
  
# This code is contributed by 29AjayKumar 

