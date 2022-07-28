

# Python3 program to generate n  
# numbers with given factors 
  
# Generate n numbers with  
# factors in factor[] 
def generateNumbers(factor, n, k): 
      
    # array of k to store next  
    # multiples of given factors  
    next = [0] * k; 
  
    # Prints n numbers  
    output = 0; # Next number to 
                # print as output  
    i = 0; 
    while(i < n): 
          
        # Find the next smallest  
        # multiple 
        toincrement = 0; 
        for j in range(k): 
            if(next[j] < next[toincrement]): 
                toincrement = j; 
  
        # Printing minimum in each  
        # iteration print the value 
        # if output is not equal to 
        # current value(to avoid the 
        # duplicates) 
        if(output != next[toincrement]): 
            output = next[toincrement]; 
            print(next[toincrement], end = " "); 
            i += 1; 
  
        # incrementing the current  
        # value by the respective factor 
        next[toincrement] += factor[toincrement]; 
  
# Driver code 
factor = [3, 5, 7]; 
n = 10; 
k = len(factor); 
generateNumbers(factor, n, k); 
      
# This code is contributed by mits 

