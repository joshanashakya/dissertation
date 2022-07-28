

# Python 3 program to print the number  
# which contain the digit d from 0 to n 
  
def index(st, ch): 
    for i in range(len(st)): 
        if(st[i] == ch): 
            return i; 
    return -1
      
# function to display the values 
def printNumbers(n, d): 
      
# Converting d to character 
    st = "" + str(d) 
    ch = st[0] 
  
    # Loop to check each digit one by one. 
    for i in range(0, n + 1, 1): 
          
        # initialize the string 
        st = "" 
        st = st + str(i) 
          
        # checking for digit 
        if (i == d or index(st, ch) >= 0): 
            print(i, end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    n = 100
    d = 5
    printNumbers(n, d) 
  
# This code is contributed by 
# Shashank_Sharma 

