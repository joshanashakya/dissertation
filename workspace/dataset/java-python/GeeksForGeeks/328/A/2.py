

# Python3 implementation of above approach  
  
# Function to calculate (2^(n-1))  
def calculatePower(b, e) : 
  
    # Initially initialize answer to 1  
    ans = 1;  
  
    while (e > 0) : 
  
        # If e is odd,  
        # multiply b with answer  
        if (e % 2 == 1) : 
            ans = ans * b;  
  
        e = e // 2;  
        b = b * b;  
      
    return ans;  
  
# Function to count subsets in which  
# X element is present  
def CountSubSet(arr, n, X) :  
  
    count = 0; checkX = 0;  
  
    # Check if X is present in  
    # given subset or not  
    for i in range(n) :  
  
        if (arr[i] == X) : 
            checkX = 1;  
            break;  
  
    # If X is present in set  
    # then calculate 2^(n-1) as count  
    if (checkX == 1) : 
        count = calculatePower(2, n - 1);  
  
    # if X is not present in a given set  
    else : 
        count = 0;  
  
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 4, 5, 6, 7 ];  
    X = 5;  
    n = len(arr);  
  
    print(CountSubSet(arr, n, X));  
  
# This code is contributed by AnkitRai01 

