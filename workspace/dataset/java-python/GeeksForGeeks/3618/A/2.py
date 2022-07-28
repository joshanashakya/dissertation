

# Python3 implementation of the approach  
  
# Function that checks if the given  
# conditions are satisfied  
def IfExists(arr, n) : 
  
    # To store the prefix sum  
    # of the array elements  
    sum = [0] * n;  
  
    # Sort the array  
    arr.sort();  
  
    sum[0] = arr[0];  
  
    # Compute the prefix sum array  
    for i in range(1, n) :  
        sum[i] = sum[i - 1] + arr[i];  
  
    # Maximum element in the array  
    max = arr[n - 1];  
  
    # Variable to check if there  
    # exists any number  
    flag = False;  
  
    for i in range(1, max + 1) : 
  
        # Stores the index of the largest  
        # number present in the array  
        # smaller than i  
        findex = 0;  
  
        # Stores the index of the smallest  
        # number present in the array  
        # greater than i  
        lindex = 0;  
  
        l = 0;  
        r = n - 1;  
  
        # Find index of smallest number  
        # greater than i  
        while (l <= r) : 
            m = (l + r) // 2;  
  
            if (arr[m] < i) : 
                findex = m;  
                l = m + 1;  
              
            else : 
                r = m - 1;  
          
        l = 1;  
        r = n;  
        flag = False;  
  
        # Find index of smallest number  
        # greater than i  
        while (l <= r) :  
            m = (r + l) // 2;  
  
            if (arr[m] > i) :  
                lindex = m;  
                r = m - 1;  
              
            else : 
                l = m + 1;  
          
        # If there exists a number  
        if (sum[findex] == sum[n - 1] - 
                           sum[lindex - 1]) :  
            flag = True;  
            break;  
          
    # If no such number exists  
    # print no  
    if (flag) :  
        print("Yes");  
    else : 
        print("No");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 2, 5 ];  
      
    n = len(arr) ; 
    IfExists(arr, n);  
      
# This code is contributed by Ryuga 

