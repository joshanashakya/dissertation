

# Python program to print any pair  
# with a given gcd G and lcm L  
   
# Function to print the pairs  
def printPair(g, l):  
    n = g * l;  
   
    # iterate over all factor pairs  
    for i in range(1,n+1):  
   
        # check if a factor  
        if (n % i == 0): 
            first = i;  
            second = n // i;  
   
            # find gcd  
            gcd = __gcd(first, second);  
   
            # check if gcd is same as given g  
            # and lcm is same as lcm l  
            if (gcd == g and l % first == 0 and
                              l % second == 0): 
                print(first , " " , second);  
                return;  
  
   
# Function return GCD of two give number  
def __gcd(a, b):  
    if(b==0): 
        return a; 
    else: 
        return __gcd(b, a % b);  
   
# Driver Code  
g = 3; 
l = 12;  
printPair(g, l); 
  
# This code is contributed by Princi Singh 

