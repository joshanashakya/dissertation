

# python3 program to find count of numbers  
# with prime frequencies  
  
# Function to check if a  
# number is prime  
  
def check_prime(n): 
    # Corner cases  
    if (n <= 1):  
        return False 
    if (n <= 3):  
        return True
    
     # This is checked so that we can skip  
     # middle five numbers in below loop  
    if (n % 2 == 0 or n % 3 == 0):  
        return False
    
    for i in range(5,n+1,6):  
        if (n % i == 0 or n % (i + 2) == 0):  
            return False
    return True
  
  
# Function to find count of numbers  
# with prime frequencies  
def countPrimeFrequent(s): 
    count = 0 
    # create a map to store  
    # frequency of each character  
    mp={}  
    
    # Store frequncy of each character  
    # in the mp  
    for i in range(0,len(s)): 
        mp.setdefault(s[i],0) 
        mp[s[i]]+=1
      
    # now iterate the map and characters  
    # with prime occurrences  
    for i in mp.keys(): 
        # if prime then increment count  
        if (check_prime(mp[i])): 
            count+=1
    return count;  
  
# Driver Code  
s = "geeksforgeeks" 
print(countPrimeFrequent(s)) 
# This code is improved by sahilshelangia 

