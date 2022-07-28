

# Python implementation of the approach 
  
# Function to return the lexicographically 
# smallest string of length n that 
# satisfies the given condition 
def lexo_small(n, k): 
  
    arr = ""; 
  
    for i in range(n): 
        arr += 'a'; 
  
    # Iteration from the last position 
    # in the array 
    for i in range(n-1,-1,-1): 
        k -= i; 
  
        # If k is a positive integer 
        if (k >= 0): 
  
            # 'z' needs to be inserted 
            if (k >= 26): 
                arr = arr[:i] + 'z' + arr[i+1:]; 
                k -= 26; 
          
            # Add the required character 
            else: 
                c= (k + 97 - 1); 
                arr = arr[:i] + chr(c) + arr[i+1:]; 
                k -= ord(arr[i]) - ord('a') + 1; 
  
        else: 
            break; 
  
        k += i; 
    return arr; 
  
# Driver code 
if __name__ == '__main__': 
    n = 5; k = 42; 
  
    arr = lexo_small(n, k); 
  
    print(arr); 
  
# This code contributed by PrinciRaj1992 

