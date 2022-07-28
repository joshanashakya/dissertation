

# Python3 implementation to find k  
# odd integers such that their sum is N  
  
# Function to find K odd integers  
# such that their sum is N  
def oddIntegers(n, k) :  
  
    # Condition to check if there  
    # exist such K integers  
    if (n % 2 != k % 2) : 
        print("-1");  
          
        return;  
  
    sum = 0;  
    i = 1;  
    j = 1;  
  
    # Loop to find first K-1  
    # distinct odd integers  
    while (j < k) : 
        sum += i;  
        print(i,end= " ");  
        i += 2;  
        j += 1;  
  
    # Final Kth odd number  
    finalOdd = n - sum;  
  
    print(finalOdd);  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 10;  
    k = 2;  
  
    oddIntegers(n, k);  
      
# This code is contributed by AnkitRai01 

