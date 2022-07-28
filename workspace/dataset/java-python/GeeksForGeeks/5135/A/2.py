

# Python3 program to print the  
# Hut Star Pattern 
import math as mt 
  
if __name__ == '__main__': 
  
    n = 7
    i, j = 0, 0
      
    # LOOP FOR HUT PYRAMID 
    while(i < n):      
        if(j == n + i): 
            j = -1
            i += 1
            print() 
              
        elif((i + j) >= n - 1): 
            print("*", end = "") 
        else: 
            print(end = " ") 
        j += 1
      
    # LOOPS FOR LOWER WALLS 
    for k in range(3):     
          
        # Left and right rectangle  
        for l in range(n - 1 + i): 
            if(l <= 2 or (l <= n - 1 + i and 
                          l >= n - 4 + i)): 
                print("*", end = "") 
            else: 
                print(end = " ") 
          
        print() 
      
# This code is contributed by 
# Mohit kumar 29 

