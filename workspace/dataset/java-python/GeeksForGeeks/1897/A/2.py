

# Python3 implementation of the approach  
maxin = 100001;  
  
# Divisors array to keep track  
# of the maximum divisor  
divisors = [0] * (maxin + 1);  
  
# Function to pre-compute the prime  
# numbers and largest divisors  
def Calc_Max_Div(arr, n) : 
  
    # Visited array to keep  
    # track of prime numbers  
    vis = [1] * (maxin + 1);  
  
    # 0 and 1 are not prime numbers  
    vis[0] = vis[1] = 0;  
  
    # Initialising divisors[i] = i  
    for i in range(1, maxin + 1) : 
        divisors[i] = i;  
  
    # For all the numbers divisible by 2  
    # the maximum divisor will be number / 2  
    for i in range(4 , maxin + 1, 2) : 
        vis[i] = 0;  
        divisors[i] = i // 2;  
      
    for i in range(3, maxin + 1, 2) : 
  
        # If divisors[i] is not equal to i then  
        # this means that divisors[i] contains  
        # minimum prime divisor for the number  
        if (divisors[i] != i) : 
  
            # Update the answer to  
            # i / smallest_prime_divisor[i]  
            divisors[i] = i // divisors[i];  
      
        # Condition if i is a prime number  
        if (vis[i] == 1) : 
            for j in range( i * i, maxin, i) :  
                vis[j] = 0;  
  
                # If divisors[j] is equal to j then  
                # this means that i is the first prime  
                # divisor for j so we update divi[j] = i  
                if (divisors[j] == j) : 
                    divisors[j] = i;  
          
    for i in range(n) : 
  
        # If the current element is prime  
        # then it has no divisors  
        # other than 1 and itself  
        if (divisors[arr[i]] == arr[i]) : 
            print("-1 ", end = "");  
        else : 
            print(divisors[arr[i]], end = " ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 5, 6, 7, 8, 9, 10 ];  
    n = len(arr);  
  
    Calc_Max_Div(arr, n);  
  
# This code is contributed by AnkitRai01 

