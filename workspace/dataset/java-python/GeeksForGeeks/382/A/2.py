

# Python3 implementation of the approach  
  
# Function to print the pair (n, r)  
# such that nCr is maximum possible  
def findPair(arr, n) :  
  
    # Array should contain atleast 2 elements  
    if (n < 2) : 
        print("-1", end = " ");  
        return;  
  
    # Maximum element from the array  
    maximum = max(arr);  
  
    # temp stores abs(middle - arr[i])  
    temp = 10000001; r = 0; middle = maximum // 2;  
  
    # Finding r with minimum abs(middle - arr[i])  
    for i in range(n) : 
  
        # When n is even then middle is (maximum / 2)  
        if (abs(middle - arr[i]) <  
                temp and n % 2 == 0) : 
            temp = abs(middle - arr[i]);  
            r = arr[i];  
  
        # When n is odd then middle elements are  
        # (maximum / 2) and ((maximum / 2) + 1)  
        elif (min(abs(middle - arr[i]),  
                  abs(middle + 1 - arr[i])) < temp  
                and n % 2 == 1) : 
            temp = min(abs(middle - arr[i]),             
                       abs(middle + 1 - arr[i]));  
            r = arr[i];  
      
    print("n =", maximum, "and r =", r);  
  
# Driver code  
if __name__ == "__main__" :  
      
    arr = [ 0, 2, 3, 4, 1, 6, 8, 9 ];  
    n = len(arr);  
  
    findPair(arr, n);  
  
# This code is contributed by AnkitRai01 

