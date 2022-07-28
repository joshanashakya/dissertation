

# Python3 implementation of the approach  
  
# Function to count the unique numbers  
def count_unique(s, n) :  
  
    # If the number has  
    # already been visited  
    if (s.count(n)) : 
        return; 
  
    # Insert the number to the set  
    s.append(n);  
  
    # First step  
    n += 1;  
  
    # Second step  
    # remove trailing zeros  
    while (n % 10 == 0) :  
        n = n // 10;  
  
    # Recur again for the new number  
    count_unique(s, n); 
  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 10
    s = [] 
      
    count_unique(s, n) 
      
    print(len(s)) 
  
# This code is contributed by Ryuga 

