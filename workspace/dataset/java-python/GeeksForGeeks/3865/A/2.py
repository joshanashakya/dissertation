

# function to count such possible numbers 
def Check_is_possible(l, r, k): 
  
    count = 0; 
  
    for i in range(l, r + 1): 
  
        # if i is divisible by k 
        if (i % k == 0): 
            count += 1; 
  
    # if count of such numbers 
    # is greater than one 
    return (count > 1); 
  
# Driver code 
l = 4; 
r = 12; 
k = 5; 
if (Check_is_possible(l, r, k)): 
    print("YES"); 
else: 
    print("NO"); 
  
# This code is contributed by mits 

