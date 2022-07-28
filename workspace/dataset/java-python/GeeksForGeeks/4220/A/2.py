

# Python3 Program to  
# generate all cyclic 
# permutations of number 
import math 
  
# Function to count the  
# total number of digits 
# in a number. 
def countdigits(N): 
    count = 0; 
    while (N): 
        count = count + 1; 
        N = int(math.floor(N / 10)); 
    return count; 
      
# Function to generate  
# all cyclic permutations 
# of a number 
def cyclic(N): 
    num = N; 
    n = countdigits(N); 
    while (1): 
        print(int(num)); 
          
        # Following three lines  
        # generates a circular  
        # permutation of a number. 
        rem = num % 10; 
        div = math.floor(num / 10); 
        num = ((math.pow(10, n - 1)) * 
                           rem + div); 
          
        # If all the permutations  
        # are checked and we obtain  
        # original number exit from loop. 
        if (num == N): 
            break;  
              
# Driver Code 
N = 5674; 
cyclic(N); 
  
# This code is contributed by mits 

