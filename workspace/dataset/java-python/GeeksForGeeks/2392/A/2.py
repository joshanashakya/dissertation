

# Python3 Program to find the nth  
# square free number  
  
# Function to find nth square  
# free number  
def squareFree(n): 
      
    # To maintain count of  
    # square free number  
    cnt = 0;  
  
    # Loop for square free numbers 
    i = 1; 
    while (True):  
        isSqFree = True; 
        j = 2; 
        while (j * j <= i):  
              
            # Checking whether square of a number  
            # is divisible by any number which is  
            # a perfect square  
            if (i % (j * j) == 0): 
                isSqFree = False;  
                break;  
            j += 1; 
  
        # If number is square free  
        if (isSqFree == True): 
            cnt += 1;  
      
            # If the cnt becomes n, return the number  
            if (cnt == n):  
                return i;  
        i += 1;  
  
    return 0;  
  
# Driver Code  
n = 10;  
print(squareFree(n));  
  
# This code is contributed by mits 

