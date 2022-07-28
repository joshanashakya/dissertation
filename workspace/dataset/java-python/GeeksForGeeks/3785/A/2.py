

# Python3 implementation of the approach 
  
# Function to return the minimum 
# inversions required so that no 
# two adjacent elements are same 
def min_changes(a, n): 
  
    # To store the inversions required 
    # to make the array {1, 0, 1, 0, 1, 0, 1, ...} 
    # and {0, 1, 0, 1, 0, 1, 0, ...} respectively 
    ans_a = 0; 
    ans_b = 0; 
  
    # Find all the changes required 
    for i in range(n): 
        if (i % 2 == 0): 
            if (a[i] == 0): 
                ans_a += 1; 
            else: 
                ans_b += 1; 
  
        else: 
            if (a[i] == 0): 
                ans_b += 1; 
            else: 
                ans_a += 1; 
  
    # Return the required answer 
    return min(ans_a, ans_b); 
  
# Driver code 
if __name__ == '__main__': 
  
    a = [ 1, 0, 0, 1, 0, 0, 1, 0 ]; 
    n = len(a); 
  
    print(min_changes(a, n)); 
  
# This code is contributed by Rajput-Ji  

