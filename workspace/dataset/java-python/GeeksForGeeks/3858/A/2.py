

# Python3 program for finding the required pairs 
  
# Finding the number of unique pairs 
def No_Of_Pairs(N): 
  
    i = 1; 
  
    # Using the derived formula 
    while ((i * i * i) + (2 * i * i) + i <= N): 
        i += 1; 
  
    return (i - 1); 
  
# Printing the unique pairs 
def print_pairs(pairs): 
  
    i = 1;  
    mul = 0; 
    for i in range(1, pairs + 1): 
        mul = i * (i + 1); 
        print("Pair no." , i, " --> (", (mul * i),  
                        ", ", mul * (i + 1), ")"); 
  
# Driver Code 
N = 500; 
i = 1; 
pairs = No_Of_Pairs(N); 
  
print("No. of pairs = ", pairs); 
print_pairs(pairs); 
  
# This code is contributed 
# by mits 

