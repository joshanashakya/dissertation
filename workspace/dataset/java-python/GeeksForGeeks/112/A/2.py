

# Python3 implementation of the approach  
MAX = 1000001
  
# Function to return the count of numbers  
# below N whose sum of prime factors is K  
def countNum(N, K) :  
  
    # To store the sum of prime factors  
    # for all the numbers  
    sumPF = [0] * MAX;  
  
    for i in range(2, N) : 
          
        # If i is prime  
        if (sumPF[i] == 0) :  
  
            # Add i to all the numbers  
            # which are divisible by i  
            for j in range(i, N, i) : 
                sumPF[j] += i;  
  
    # To store the count of required numbers  
    count = 0;  
    for i in range(2, N) : 
        if (sumPF[i] == K) : 
            count += 1;  
  
    # Return the required count  
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 20; K = 7; 
      
    print(countNum(N, K));  
  
# This code is contributed by AnkitRai01 

