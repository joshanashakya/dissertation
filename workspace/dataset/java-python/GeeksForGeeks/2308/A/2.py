

# Python3 implementation of the approach  
N = 100005
  
lpf = [0] * N;  
  
# Function to calculate least  
# prime factor of each number  
def least_prime_factor() : 
  
    for i in range(2, N) : 
  
        # If it is a prime number  
        if (not lpf[i]) : 
  
            for j in range(i, N, i) :  
  
                # For all multiples which are not  
                # visited yet.  
                if (not lpf[j]) : 
                    lpf[j] = i;  
  
# Function to find the value of Mobius function  
# for all the numbers from 1 to n  
def Mobius(n) : 
  
    # To store the values of Mobius function  
    mobius = [0] * N;  
  
    for i in range(1, N) : 
  
        # If number is one  
        if (i == 1) : 
            mobius[i] = 1;  
        else : 
  
            # If number has a squared prime factor  
            if (lpf[i // lpf[i]] == lpf[i]) : 
                mobius[i] = 0;  
  
            # Multiply -1 with the previous number  
            else : 
                mobius[i] = -1 * mobius[i // lpf[i]];  
  
    for i in range(1, n + 1) : 
        print(mobius[i], end = " ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 5;  
  
    # Function to find least prime factor  
    least_prime_factor();  
  
    # Function to find mobius function  
    Mobius(n);  
  
# This code is contributed by AnkitRai01 

