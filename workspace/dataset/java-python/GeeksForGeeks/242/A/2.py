

# Python3 implementation of the approach  
  
# Function to return the maximum  
# product value  
def maxProd(arr, n, k) : 
  
    # To store the product  
    product = 1;  
    s = dict.fromkeys(arr, 0);  
  
    # Sort the array  
    arr.sort();  
  
    for i in range(n) : 
        if (s[arr[i]] == 0) : 
  
            # Efficiently finding product  
            # including every element once  
            product = product * arr[i];  
  
        # Storing values in hash map  
        s[arr[i]] = s[arr[i]] + 1;  
  
    j = n - 1; 
    while (j >= 0 and k > 0) : 
          
        if ((k > (s[arr[j]] - 1)) and 
           ((s[arr[j]] - 1) > 0)) : 
  
            # Including the greater repeating values  
            # so that product can be maximized  
            product *= pow(arr[j], s[arr[j]] - 1);  
            k = k - s[arr[j]] + 1;  
            s[arr[j]] = 0;  
          
        if (k <= (s[arr[j]] - 1) and 
                ((s[arr[j]] - 1) > 0)) :  
            product *= pow(arr[j], k);  
            break; 
        j -= 1
          
    return product;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 5, 6, 7, 8, 2, 5, 6, 8 ];  
    n = len(arr) ; 
    k = 2;  
      
    print(maxProd(arr, n, k));  
      
# This code is contributed by Ryuga 

