

# Python 3 implementation of the approach 
  
  
# Function that print the 
# desired array which 
# satisfies the given conditions 
def solve(n, k): 
    mini = 0
    x1 = 1
    a = [0 for i in range(k)] 
    for i in range(1, k + 1): 
        mini += x1 
        a[i - 1] = x1 
        x1 += 1
  
    # If the lowest filling condition 
    # is void, then it is not possible to 
    # generate the required array 
    if (n < mini): 
        print("-1",end = "") 
        return
  
    rem = n - mini 
    cnt = int(rem / k) 
    rem = rem % k 
  
    # Increase all the elements by cnt 
    for i in range(k): 
        a[i] += cnt 
  
    # Start filling from the back 
    # till the number is a[i+1] <= 2*a[i] 
    i = k - 1
    while (i > 0 and rem > 0): 
        # Get the number to be filled 
        xx = a[i - 1] * 2
        left = xx - a[i] 
        # If it is less than the 
        # remaining numbers to be filled 
        if (rem >= left): 
            a[i] = xx 
            rem -= left 
  
        # less than remaining numbers 
        # to be filled 
        else: 
            a[i] += rem 
            rem = 0
              
        i -= 1
  
    # Get the sum of the array 
    sum = a[0] 
    for i in range(1, k): 
        # If this condition is void at any stage 
        # during filling up, then print -1 
        if (a[i] > 2 * a[i - 1]): 
            print("-1", end = "") 
            return
  
        # Else add it to the sum 
        sum += a[i] 
  
    # If the sum condition is not 
    # satisified, then print -1 
    if (sum != n): 
        print("-1", end = "") 
        return
  
    # Print the generated array 
    for i in range(k): 
        print(a[i], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    n = 26
    k = 6
    solve(n, k) 
  
# This code is contributed by 
# Surendra_Gangwar 

