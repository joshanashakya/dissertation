

# Python3 implementation of the approach  
import sys; 
  
# Finds the sub-array with maximum length  
def FindSubarray(arr, n, k) :  
  
    # Array which stores number of ones  
    # present in the binary representation  
    # of ith element of the array  
    count_one = [0] * n;  
  
    for i in range(n) :  
        count_one[i] = bin(arr[i]).count('1'); 
      
    # Sum variable to store sum of  
    # number of ones  
    # Initialize it as number of ones  
    # present in the binary representation  
    # of 0th element of the array  
    sum = count_one[0];  
  
    # If there is only a single element  
    if (n == 1) : 
          
        if (count_one[0] >= k) : 
            return 1;  
        else : 
            return -1;  
      
    # Stores the minimum length  
    # of the required sub-array  
    ans = sys.maxsize;  
  
    i = 1;  
    j = 0;  
  
    while (i < n) : 
          
        # If binary representation of jth  
        # element of array has 1's equal to k  
        if (k == count_one[j]) : 
            ans = 1;  
            break;  
          
        # If binary representation of ith  
        # element of array has 1's equal to k  
        elif (k == count_one[i]) : 
            ans = 1; 
            break;  
          
        # If sum of number of 1's of  
        # binary representation of elements upto  
        # ith element is less than k  
        elif (sum + count_one[i] < k) :  
            sum += count_one[i];  
            i += 1;  
          
        # If sum of number of 1's of  
        # binary representation of elements upto  
        # ith element is greater than k  
        elif (sum + count_one[i] > k) :  
            ans = min(ans, (i - j) + 1);  
            sum -= count_one[j];  
            j += 1;  
          
        elif (sum + count_one[i] == k) : 
            ans = min(ans, (i - j) + 1);  
            sum += count_one[i];  
            i += 1;  
  
    if (ans != sys.maxsize) : 
        return ans;  
  
    else : 
        return -1;  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 1, 2, 4, 8 ];  
    n = len(arr);  
    k = 2;  
  
    print(FindSubarray(arr, n, k));  
  
# This code is contributed by Ryuga 

