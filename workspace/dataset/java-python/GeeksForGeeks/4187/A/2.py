

# Python3 implementation of the approach  
  
# Function to return the count of K's  
# such that the array can be divided  
# into two sets containing equal number  
# of elements when all the elements less  
# than K are in one set and the rest  
# of the elements are in the other set  
def two_sets(a, n) : 
  
    # Sort the given array  
    a.sort();  
  
    # Return number of such Ks  
    return (a[n // 2] - a[(n // 2) - 1]);  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 1, 4, 4, 6, 7, 9 ];  
    n = len(a);  
  
    print(two_sets(a, n));  
  
# This code is contributed by AnkitRai01 

