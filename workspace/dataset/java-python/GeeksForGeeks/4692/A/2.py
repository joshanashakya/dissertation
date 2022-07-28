

# Python3 implementation of  
# the above approach  
M = 3; N = 2;  
  
# Function to generate the index of 
# the glass containing the ball  
def getIndex(n, shuffle) : 
  
    for i in range(3) : 
  
        # Checking if the glasses  
        # being shuffled contain  
        # the ball  
  
        # Change the index  
        if (shuffle[i][0] == n) : 
            n = shuffle[i][1];  
  
        # Change the index  
        elif (shuffle[i][1] == n) : 
            n = shuffle[i][0]; 
  
    # Print the index  
    print(n);  
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 3;  
  
    # Storing all the shuffle operation  
    shuffle = [[ 3, 1 ],  
               [ 2, 1 ],  
               [ 1, 2 ]];  
  
    getIndex(n, shuffle);  
  
# This code is contributed by AnkitRai01 

