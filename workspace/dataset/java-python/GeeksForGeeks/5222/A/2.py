

# Efficient Python3 Program to  
# print all cube free 
# numbers smaller than or  
# equal to n. 
  
def printCubeFree(n): 
    # Initialize all numbers  
    # as not cube free  
    cubFree = [1]*(n + 1); 
      
    # Traverse through all  
    # possible cube roots 
    i = 2; 
    while(i * i * i <= n): 
          
        # If i itself 
        # is cube free 
        if(cubFree[i]==1): 
              
            # Mark all multiples of 
            # i as not cube free 
            multiple = 1; 
            while(i * i * i * multiple <= n): 
                cubFree[i * i * i * multiple] = 0; 
                multiple+=1; 
        i+=1; 
    # Print all cube 
    # free numbers 
    for i in range(2,n+1): 
        if (cubFree[i] == 1): 
            print(i,end=" "); 
  
# Driver Code 
if __name__ == "__main__": 
    printCubeFree(20); 
  
# This code is contributed  
# by mits 

