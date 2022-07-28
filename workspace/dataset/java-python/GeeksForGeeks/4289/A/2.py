

#Python3 program to print  
# the inverse diamond shape  
      
  
# Function to Print Inverse  
# Diamond pattern  
# with 2n-1 rows  
def printDiamond(n) : 
    print("") 
    j = 0
      
    # for top half  
    for i in range(0,n):  
          
        # for left *  
        for j in range(i,n): 
            print("*",end="") 
              
        # for middle " " 
        for j in range(0,2 * i + 1): 
            print(" ",end="") 
              
        # for right *  
        for j in range(i,n): 
            print("*",end="") 
              
        print("") 
      
    # for below half  
    for i in range(0,n-1): 
          
        # for left *  
        for j in range(0, i+2): 
            print("*",end="") 
              
        # for middle " "  
        for j in range(0,2 * (n - 1 - i) - 1): 
            print(" ",end="") 
              
        # for right *  
        for j in range(0, i+2): 
            print("*",end="") 
              
        print("") 
          
    print("") 
      
      
# Driver Code  
  
if __name__=='__main__': 
      
# Define n  
    n = 3
    print("Inverse Diamond Pattern for n = ",n)  
    printDiamond(n)  
      
    n = 7
    print("\nInverse Diamond Pattern for n = ",n ) 
    printDiamond(n)  
  
# this code is contributed by Smitha Dinesh Semwal 

