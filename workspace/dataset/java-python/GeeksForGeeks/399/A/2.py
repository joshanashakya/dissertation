

# Naive Python program to count number of pairs 
# such that their hcf and lcm are equal 
  
# Function to return HCF of two numbers 
def gcd(a, b): 
    if (a == 0): 
        return b; 
    return gcd(b % a, a); 
  
# Function to return LCM of two numbers 
def lcm(a, b): 
    return (a * b) / gcd(a, b); 
  
# Returns the number of valid pairs 
def countPairs(arr, n): 
    ans = 0; # initializing answer 
  
    # Traversing the array. For each array 
    # element, checking if it 
    # follow the condition 
    for i in range(n): 
        for j in range(i+1,n): 
            if (lcm(arr[i], arr[j]) == gcd(arr[i], arr[j])): 
                ans+=1; 
    return ans; 
  
# Driver function 
if __name__ == '__main__': 
    arr = [ 1, 1, 1 ]; 
    n = len(arr); 
    print(countPairs(arr, n)); 
  
# This code is contributed by 29AjayKumar 

