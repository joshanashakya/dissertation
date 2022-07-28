

# Python3 program to check if the  
# digits are in the given order  
  
# Check if the digits follow  
# the correct order  
def isCorrectOrder(n):  
  
    flag = True;  
      
    # to store the prevoius digit  
    prev = -1;  
      
    # pointer to tell what type of  
    # sequence are we dealing with  
    type = -1;  
  
    while(n != 0): 
        if(type ==-1): 
            if(prev ==-1): 
                prev = n % 10;  
                n = int(n / 10);  
                continue;  
              
            # check if we have same digit  
            # as the prevoius digit  
            if(prev == n % 10):  
                flag = False;  
                break;  
              
            # checking the peak point  
            # of the number  
            if(prev > n % 10): 
                type = 1;  
                prev = n % 10;  
                n = int(n / 10);  
                continue;  
              
            prev = n % 10;  
            n = int(n / 10);  
        else: 
              
            # check if we have same digit  
            # as the prevoius digit  
            if(prev == n % 10): 
                flag = False;  
                break;  
              
            # check if the digit is greater  
            # than the prevoius one  
            # If true, then break from the  
            # loop as we are in decending 
            # order part  
            if(prev < n % 10):  
                flag = False;  
                break;  
              
            prev = n % 10;  
            n = int(n / 10);  
  
    return flag;  
  
# Driver code  
n = 123454321;  
  
if(isCorrectOrder(n)):  
    print("YES");  
else: 
    print("NO");  
  
# This Code is contributed by mits 

