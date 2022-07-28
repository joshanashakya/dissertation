

# Python 3 program to 
# print half diamond  
# number star pattern  
  
# Function to print the  
# given pattern  
def printPattern(r) : 
  
    r = r // 2
    count = r 
  
    # loop to print upper 
    # half pattern 
    for i in range(r) : 
        for j in range(r, i, -1) : 
            if j != r : 
                print("*" + str(count),  
                             end = "") 
            else : 
                print(count, end = "") 
  
        count -= 1
        print() 
  
    count += 1
  
    # loop to print lower 
    # half pattern 
    for i in range(r) : 
        for j in range(i + 1): 
            if j != 0 : 
                print("*" + str(count),  
                             end = "") 
            else :  
                print(count, end = "") 
  
        count += 1
        print() 
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 6
  
    printPattern(n) 
              
# This code is contributed 
# by ANKITRAI1 

