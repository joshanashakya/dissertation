

# Python3 implementation of finding all k  
# such that arr[i]%k is same for each i  
  
# Prints all k such that arr[i]%k is  
# same for all i  
def printEqualModNumbers(arr, n): 
      
    # sort the numbers  
    arr.sort();  
      
    # max difference will be the difference  
    # between first and last element of  
    # sorted array  
    d = arr[n - 1] - arr[0];  
    // Case when all the array elements are same 
    if(d==0): 
        print("Infinite solution") 
        return
      
    # Find all divisors of d and store  
    # in a vector v[]  
    v = []; 
    i = 1; 
    while (i * i <= d):  
        if (d % i == 0):  
                v.append(i); 
                if (i != d / i): 
                    v.append(d / i); 
        i += 1; 
      
    # check for each v[i] if its modulus with  
    # each array element is same or not  
    for i in range(len(v)):  
        temp = arr[0] % v[i];  
      
        # checking for each array element if  
        # its modulus with k is equal to k or not  
        j = 1;  
        while (j < n):  
            if (arr[j] % v[i] != temp):  
                break; 
            j += 1; 
  
        # if check is true print v[i]  
        if (j == n):  
            print(v[i], end = " ");  
  
# Driver Code 
arr = [38, 6, 34];  
printEqualModNumbers(arr, len(arr));  
          
# This code is contributed by mits 

