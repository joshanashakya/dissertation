

# Python3 implementation of the approach  
  
# Function to find the number of pairs  
# from the set of natural numbers up to  
# N whose sum is divisible by K  
def findPairCount(N, K) :  
    count = 0; 
      
    # Declaring a Hash to store count 
    rem = [0] * K; 
      
    rem[0] = N // K;  
      
    # Storing the count of integers with  
    # a specific remainder in Hash array  
    for i in range(1, K) : 
        rem[i] = (N - i) // K + 1; 
          
    # Check if K is even  
    if (K % 2 == 0) : 
          
        # Count of pairs when both  
        # integers are divisible by K  
        count += (rem[0] * (rem[0] - 1)) // 2;  
          
        # Count of pairs when one remainder  
        # is R and other remainder is K - R  
        for i in range(1, K // 2) : 
            count += rem[i] * rem[K - i];  
          
        # Count of pairs when both the  
        # remainders are K / 2  
        count += (rem[K // 2] * (rem[K // 2] - 1)) // 2; 
          
    else : 
          
        # Count of pairs when both  
        # integers are divisible by K  
        count += (rem[0] * (rem[0] - 1)) // 2;  
          
        # Count of pairs when one remainder is R  
        # and other remainder is K - R  
        for i in rage(1, K//2 + 1) : 
            count += rem[i] * rem[K - i];  
      
    return count;  
  
# Driver code  
if __name__ == "__main__" : 
  
    N = 10 ; K = 4;  
  
    # Print the count of pairs  
    print(findPairCount(N, K));  
  
# This code is contributed by Ryuga 

