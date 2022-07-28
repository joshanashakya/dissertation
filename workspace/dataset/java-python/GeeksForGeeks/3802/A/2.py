

# Python3 implementation of the approach  
  
# Function that returns true if it is  
# possible to make the permutation  
# increasing by swapping any two numbers  
def isPossible(a, n) : 
  
    # To count misplaced elements  
    k = 0;  
  
    # Count all misplaced elements  
    for i in range(n) :  
        if (a[i] != i + 1) : 
            k += 1;  
  
    # If possible  
    if (k <= 2) : 
        return True;  
  
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [5, 2, 3, 4, 1 ];  
    n = len(a);  
  
    if (isPossible(a, n)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

