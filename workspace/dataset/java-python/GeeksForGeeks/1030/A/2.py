

# Python3 code for above given approach 
N = 100005
mod = 1000000007
  
# To store the number of divisors  
cnt = [0] * N;  
  
# Function to find the number of divisors  
# of all numbers in the range 1 to n  
def Divisors() :  
  
    # For every number 1 to n  
    for i in range(1, N) : 
  
        # Increase divisors count 
        # for every number  
        for j in range(1, N // i) :  
            cnt[i * j] += 1;  
  
# Function to find the sum of divisors  
def Sumofdivisors(A, B, C) :  
      
    # To store sum  
    sum = 0;  
  
    Divisors();  
  
    for i in range(1,A + 1) : 
        for j in range(1, B + 1) :  
            for k in range(1, C + 1) : 
                x = i * j * k; 
                  
                # Count the diviosrs 
                sum += cnt[x]; 
                if (sum >= mod) : 
                    sum -= mod;  
  
    return sum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    A = 5; B = 6; C = 7;  
  
    # Function call  
    print(Sumofdivisors(A, B, C));  
  
# This code is contributed by Ryuga 

