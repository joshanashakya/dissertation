

# Python3 program to find the sum of prime 
# factors of all numbers in range [L-R] 
N = 10000; 
arr = [0] * N; 
  
# function to compute the seive 
def seive(): 
    i = 2; 
    while(i * i < N): 
          
        # i is prime 
        if (arr[i] == 0): 
              
            # add i to all the multiple  
            # of i till N 
            j = 2; 
            while (i * j < N): 
                arr[i * j] += i; 
                j += 1; 
        i += 1; 
  
# function that returns the sum 
def sum(l, r): 
  
    # Function call to compute seive 
    seive(); 
  
    # prefix array to keep the  
    # sum of all arr[i] till i 
    pref_arr = [0] * (r + 1); 
    pref_arr[0] = arr[0]; 
  
    # calculate the prefix sum  
    # of prime divisors 
    for i in range(1, r + 1):  
        pref_arr[i] = pref_arr[i - 1] + arr[i]; 
  
    # lower is the beginning of array 
    if (l == 1): 
        return (pref_arr[r]); 
  
    # lower is not the beginning 
    # of the array 
    else: 
        return (pref_arr[r] - 
                pref_arr[l - 1]); 
  
# Driver Code 
l = 5; 
r = 10; 
print(sum(l, r)); 
  
# This code is contributed by mits 

