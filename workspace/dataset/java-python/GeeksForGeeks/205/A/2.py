

# Python program to check if a given sequence 
# is a concatenation of two permutations or not 
  
# Function to Check if a given sequence 
# is a concatenation of two permutations or not 
def checkPermutation(arr, n): 
      
    # Computing the sum of all the 
    # elements in the array 
    sum = 0; 
    for i in range(n): 
        sum += arr[i]; 
  
    # Computing the prefix sum 
    # for all the elements in the array 
    prefix = [0]*(n + 1); 
    prefix[0] = arr[0]; 
    for i in range(n): 
        prefix[i] = prefix[i - 1] + arr[i]; 
  
    # Iterating through the i 
    # from lengths 1 to n-1 
    for i in range(n - 1): 
  
        # Sum of first i+1 elements 
        lsum = prefix[i]; 
  
        # Sum of remaining n-i-1 elements 
        rsum = sum - prefix[i]; 
  
        # Lengths of the 2 permutations 
        l_len = i + 1
        r_len = n - i - 1; 
  
        # Checking if the sums 
        # satisfy the formula or not 
        if (((2 * lsum)== (l_len * (l_len + 1))) and 
            ((2 * rsum)== (r_len * (r_len + 1)))): 
            return True; 
      
    return False; 
  
# Driver code 
if __name__=='__main__':  
  
    arr = [ 1, 2, 5, 3, 4, 1, 2 ] 
    n = len(arr) 
  
    if (checkPermutation(arr, n)): 
        print("Yes"); 
    else: 
        print("No"); 
  
# This code is contributed by Princi Singh 

