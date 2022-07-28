

# Python 3 program to find the GCD of 
# elements which occur Fibonacci 
# number of times 
from collections import defaultdict  
import math  
   
# Function to create hash table 
# to check Fibonacci numbers 
def createHash(hash1,maxElement): 
  
    # Inserting the first two 
    # numbers into the hash 
    prev , curr = 0, 1
    hash1.add(prev) 
    hash1.add(curr) 
   
    # Adding the remaining Fibonacci 
    # numbers using the previously 
    # added elements 
    while (curr <= maxElement): 
        temp = curr + prev 
        if temp <= maxElement: 
            hash1.add(temp) 
        prev = curr 
        curr = temp 
   
# Function to return the GCD of elements 
# in an array having fibonacci frequency 
def gcdFibonacciFreq(arr, n): 
  
    hash1 = set() 
   
    # Creating the hash 
    createHash(hash1,max(arr)) 
   
    # Map is used to store the 
    # frequencies of the elements 
    m = defaultdict(int) 
   
    # Iterating through the array 
    for i in range(n): 
        m[arr[i]] += 1
   
    gcd = 0
   
    # Traverse the map using iterators 
    for it in m.keys(): 
   
        # Calculate the gcd of elements 
        # having fibonacci frequencies 
        if (m[it] in hash1): 
            gcd = math.gcd(gcd,it) 
    return gcd 
   
# Driver code 
if __name__ == "__main__": 
      
    arr = [ 5, 3, 6, 5, 
                  6, 6, 5, 5 ] 
    n = len(arr) 
   
    print(gcdFibonacciFreq(arr, n)) 
   
 # This code is contributed by chitranayal 

