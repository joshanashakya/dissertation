

# Program to find nth centered  
# dodecahedral number 
  
# Function to find centered 
# dodecahedral number 
def CenteredDodecahedral_num(n) : 
      
    # Formula to calculate nth 
    # centered dodecahedral number 
    return (2 * n + 1) * (5 * n * n + 5 * n + 1) 
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 3
    print(n,"rd centered dodecahedral number: ", 
                CenteredDodecahedral_num(n)) 
    n = 10
    print(n,"th centered dodecahedral number : ", 
                CenteredDodecahedral_num(n)) 
                  
# This code is contributed by aj_36 

