

# Python3 implementation of the above approach 
  
# Function for finding the smallest 
# possible number after swapping 
# the digits any number of times 
def smallestPoss(s, n): 
      
    # Variable to store the final answer 
    ans = ""; 
  
    # Array to store the count of 
    # occurrence of each digit 
    arr = [0]*10; 
  
    # Loop to calculate the number 
    # of occurrences of every digit 
    for i in range(n): 
        arr[ord(s[i]) - 48] += 1; 
      
    # Loop to get smallest number 
    for i in range(10): 
        for j in range(arr[i]): 
            ans = ans + str(i); 
      
    # Returning the answer 
    return ans; 
  
# Driver code 
if __name__ == '__main__': 
    N = 15; 
    K = "325343273113434"; 
  
    print(smallestPoss(K, N)); 
  
# This code is contributed by 29AjayKumar 

