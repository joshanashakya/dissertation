

# Python3 implementation to find the row  
# whose product has maximum number  
# of prime factors  
N = 3
M = 5
  
Large = int(1e6);  
  
prime = [];  
  
# function for SieveOfEratosthenes  
def SieveOfEratosthenes() : 
  
    # Create a boolean array "isPrime[0..N]"  
    # and initialize all entries it as true.  
    # A value in isPrime[i] will finally be  
    # false if i is not a prime, else true.  
    isPrime = [True]*(Large + 1);  
      
    for p in range(2, int(Large**(1/2))) :  
  
        # check if isPrime[p] is not changed  
        if (isPrime[p] == True) : 
  
            # Update all multiples of p  
            for i in range(p*2, Large + 1, p) :  
                isPrime[i] = False;  
  
    # Print all isPrime numbers  
    for p in range(2, Large + 1) : 
  
        if (isPrime[p]) : 
  
            prime.append(p);  
  
# function to display the answer  
def Display(arr, row) :  
  
    for i in range(M) :  
        print(arr[row][i], end=" ");  
  
# function to Count the row number of  
# divisors in particular row multiplication  
def countDivisorsMult(arr) :  
  
    # Find count of occurrences  
    # of each prime factor  
    mp = {}; 
    row_no = 0;max_factor = 0;  
  
    for i in range(N) : 
        for j in range(M) :  
            no = arr[i][j] 
              
            for k in range(len(prime)) : 
                while (no > 1 and no % prime[k] == 0) : 
                      
                    no //= prime[k]; 
                      
                    if prime[k] not in mp : 
                        mp[prime[k]] = 0
                      
                    mp[prime[k]] += 1; 
                      
                if (no == 1) : 
                    break;  
  
        # Compute count of all divisors  
        res = 1;  
        for it in mp : 
            res *= mp[it];  
  
        # Update row number if  
        # factors of this row is max  
        if (max_factor < res) : 
            row_no = i;  
            max_factor = res;  
          
        # Clearing map to store  
        # prime factors for next row  
        mp.clear();  
  
    Display(arr, row_no);  
  
# Driver code  
if __name__ == "__main__" :  
  
  
    arr = [ [ 1, 2, 3, 10, 23 ],  
            [ 4, 5, 6, 7, 8 ],  
            [ 7, 8, 9, 15, 45 ] ];  
  
    SieveOfEratosthenes();  
  
    countDivisorsMult(arr);  
  
# This code is contributed by Yash_R 

