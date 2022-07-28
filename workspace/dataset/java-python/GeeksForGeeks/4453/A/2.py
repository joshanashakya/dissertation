

# Python 3 program to print  
# the following pyramid pattern  
  
# function to print the  
# following pyramid pattern  
def printPattern(n) : 
  
    j, k = 0, 0
  
    # loop to decide the row number  
    for i in range(1, n + 1) : 
  
        # if row number is odd  
        if i % 2 != 0 : 
  
            # print numbers with 
            # the '*' sign in  
            # increasing order  
            for j in range(k + 1, k + i) : 
  
                print(str(j) + "*",  
                          end = "") 
  
            j = k + i 
            print(j) 
            j += 1
  
            # update value of 'k'  
            k = j 
  
        # if row number is even 
        else : 
  
            # update value of 'k'  
            k = k + i - 1
  
            # print numbers with the  
            # '*' in decreasing order  
            for j in range(k, k - i + 1, -1) : 
                print(str(j) + "*", end = "") 
  
            j = k - i + 1
            print(j) 
  
# Driver Code 
if __name__ == "__main__" : 
    n = 5
  
    # function calling  
    printPattern(n) 
              
# This code is contributed  
# by ANKITRAI1 

