

# Python 3 program to print the pattern 
  
# Function to print pattern  
# for given value of n 
def pattern(n): 
  
    k = 1
      
    # Outer "for" loop for number of rows 
    for i in range(1 , n+1): 
          
        # set the value of "p" as "k". 
        p = k 
  
        # Inner "for" loop for number of columns 
        for j in range(1 , i+1): 
              
            # print the values 
            print(p , end=" ") 
              
            # change in value of "p" for 
            # every elements after the first  
            # element of each row . 
            p = p - (n + j - i) 
          
        print("") 
        # value of "k" for first  
        # element of every row. 
        k = k + 1 + n - i 
      
# Driver Code 
n = 5
  
# Function calling 
pattern(n) 
  
# This code is contributed by Smitha 

