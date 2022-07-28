

# Python3 code to implement the above approach  
def CountSubSet(arr, n, X) :  
  
    # N stores total number of subsets  
    N = 2 ** n; 
    count = 0;  
  
    # Generate each subset one by one  
    for i in range(N) : 
  
        # Check every bit of i  
        for j in range(n) : 
  
            # if j'th bit of i is set,  
            # check arr[j] with X  
            if (i & (1 << j)) : 
                if (arr[j] == X) : 
                    count += 1;  
      
    return count;  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 4, 5, 6, 7 ];  
    X = 5;  
    n = len(arr);  
  
    print(CountSubSet(arr, n, X));  
  
# This code is contributed by AnkitRai01 

