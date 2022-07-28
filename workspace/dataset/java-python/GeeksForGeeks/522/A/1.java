

// Java program to find the Largest Special Prime 
// which is less than or equal to a given number 
  
class GFG 
{ 
  
        // Function to check whether the number 
        // is a special prime or not 
    static boolean checkSpecialPrime(boolean [] sieve, int num) 
        { 
            // While number is not equal to zero 
            while (num!=0) { 
                // If the number is not prime 
                // return false. 
                if (!sieve[num]) { 
                    return false; 
                } 
          
                // Else remove the last digit 
                // by dividing the number by 10. 
                num /= 10; 
            } 
          
            // If the number has become zero 
            // then the number is special prime, 
            // hence return true 
            return true; 
        } 
          
        // Function to find the Largest Special Prime 
        // which is less than or equal to a given number 
        static void findSpecialPrime(int N) 
        { 
            boolean []sieve=new boolean[N+10]; 
            sieve[0] = sieve[1] = false; 
  
            // Initially all numbers are considered Primes. 
            for(int i=0;i<N+10;i++) 
                sieve[i]=true; 
              
            for (int i = 2; i <= N; i++) { 
                if (sieve[i]) { 
          
                    for ( int j = i * i; j <= N; j += i) { 
                        sieve[j] = false; 
                    } 
                } 
            } 
          
            // There is always an answer possible 
            while (true) { 
                // Checking if the number is a 
                // special prime or not 
                if (checkSpecialPrime(sieve, N)) { 
                    // If yes print the number 
                    // and break the loop. 
                    System.out.println(N); 
                    break; 
                } 
                // Else decrement the number. 
                else
                    N--; 
            } 
        } 
          
        // Driver code 
        public static void main(String [] args) 
        { 
            findSpecialPrime(379); 
            findSpecialPrime(100); 
          
              
        } 
  
// This code is contributed by ihritik 
  
} 

