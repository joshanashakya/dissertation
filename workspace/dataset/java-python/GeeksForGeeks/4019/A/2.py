

# Python3 program remove two consecutive integers  
# from 1 to N to make sum equal to S  
  
# Function to find the numbers  
# to be removed  
def findNumber(N, S) : 
  
    # typecast appropriately  
    # so that answer is float  
    i = (((N) * (N + 1)) / 4) - ((S + 1) / 2);  
  
    # return the obtained result  
    return i;  
  
def check(N, S) : 
  
    i = findNumber(N, S);  
  
    # Convert i to integer  
    integerI = int(i);  
  
    # If i is an integer is 0  
    # then answer is Yes  
    if (i - integerI == 0) : 
        print("Yes:", integerI, 
                 ",", integerI + 1);  
    else : 
        print("No"); 
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 4; 
    S = 3;  
    check(N, S);  
  
    N = 5; 
    S = 3;  
    check(N, S);  
  
# This code is contributed by AnkitRai01 

