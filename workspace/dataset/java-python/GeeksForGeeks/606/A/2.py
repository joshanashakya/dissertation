

# python3 program to print all prime points 
   
# Function to count number of digits 
def countDigits(n): 
    count = 0
    while (n > 0): 
        count+=1
        n = n//10
      
    return count 
   
#Function to check whether a number is 
# prime or not. Returns 0 if prime else -1 
def checkPrime(n): 
    # Corner cases 
    if (n <= 1): 
        return -1
    if (n <= 3): 
        return 0
   
    # This is checked so that we can skip 
    # middle five numbers in below loop 
    if (n%2 == 0 or n%3 == 0): 
        return -1
   
    i=5 
    while i*i<=n: 
        if (n%i == 0 or n%(i+2) == 0): 
            return -1
        i+=6
   
    return 0
   
# Function to print prime points 
def printPrimePoints(n): 
  
    # counting digits 
    count = countDigits(n) 
   
    # As single and double digit numbers do not 
    # have left and right number pairs 
    if (count==1 or count==2): 
      
        print ("-1") 
        return
      
   
    # Finding all left and right pairs. Printing 
    # the prime points accordingly. Discarding 
    # first and last index point 
    found = False
    for i in range(1,(count-1)): 
        #Calculating left number 
        left = n //(pow(10,count-i)) 
   
        #Calculating right number 
        right = n % (pow(10,count-i-1)) 
   
        # Prime point condition 
        if (checkPrime(left) == 0 and
            checkPrime(right) == 0): 
          
            print (i ,end=" ") 
            found = True
   
    # No prime point found 
    if (found == False): 
        print ("-1") 
   
# Driver Program 
if __name__ == "__main__": 
  
    n = 2317
    printPrimePoints(n) 
     

