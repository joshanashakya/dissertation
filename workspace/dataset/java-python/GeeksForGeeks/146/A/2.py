

# Python3 program to print all elements  
# of Array which can be expressed  
# as power of prime numbers  
  
# Function to mark all the  
# exponent of prime numbers  
def ModifiedSieveOfEratosthenes(N, Expo_Prime) : 
      
    primes = [True]*N;  
  
    for i in range(2, N) : 
        if (primes[i]) : 
  
            no = i;  
  
            # If number is prime then marking  
            # all of its exponent true  
            while (no <= N) : 
  
                Expo_Prime[no] = True;  
                no *= i;  
  
            for j in range(i * i, N, i) :  
                primes[j] = False;  
      
# Function to diplay all required elements  
def Display(arr, Expo_Prime, n) :  
  
    for i in range(n) : 
        if (Expo_Prime[arr[i]]) : 
            print(arr[i], end= " "); 
  
# Function to print the required numbers  
def FindExpoPrime(arr, n) :  
  
    max = 0;  
  
    # To find the largest number  
    for i in range(n) : 
        if (max < arr[i]) : 
            max = arr[i];  
  
    Expo_Prime = [False]*(max + 1);  
  
    # Function call to mark all the  
    # Exponential prime nos.  
    ModifiedSieveOfEratosthenes(max + 1, Expo_Prime);  
  
    # Function call  
    Display(arr, Expo_Prime, n);  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 4, 6, 9, 16, 1, 3,  
                12, 36, 625, 1000 ];  
    n = len(arr);  
  
    FindExpoPrime(arr, n);  
  
# This code is contributed by Yash_R  

