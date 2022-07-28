

# Function to check the condition  
def check(H, S): 
      
    # Condition for triangle to exist  
    return H * H >= 4 * S; 
  
# Function to find all pairs  
def findPairs(H, n, S, m): 
    count = 0;  
      
    # Sort both the arrays  
    H.sort();  
    S.sort();  
  
    # To keep track of last possible Area  
    index = -1;  
      
    for i in range(n):  
          
        # Apply Binary Search for  
        # each Hypotenuse Length  
        start = 0;  
        end = m - 1;  
          
        while (start <= end):  
            mid = int(start + (end - start) / 2);  
            if (check(H[i], S[mid])):  
                index = mid;  
                start = mid + 1;  
            else: 
                end = mid - 1;  
          
        # Check if we get any possible 
        # Area or Not  
        if (index != -1): 
              
            # All area less than area[index]  
            # satisfy property  
            count += index + 1;  
  
    return count;  
  
# Driver code  
H = [ 1, 6, 4 ];  
n = len(H);  
  
S= [ 23, 3, 42, 14 ];  
m = len(S);  
  
print(findPairs(H, n, S, m)); 
  
# This code is contributed by mits 

