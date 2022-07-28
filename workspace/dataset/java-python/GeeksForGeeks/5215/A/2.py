

# Python3 program to find  
# Pythagorean Triplet of  
# given sum. 
  
def pythagoreanTriplet(n): 
  
    # Considering triplets in  
    # sorted order. The value  
    # of first element in sorted  
    # triplet can be at-most n/3. 
    for i in range(1, int(n / 3) + 1):  
          
        # The value of second element  
        # must be less than equal to n/2 
        for j in range(i + 1,  
                       int(n / 2) + 1):  
  
            k = n - i - j 
            if (i * i + j * j == k * k):  
                print(i, ", ", j, ", ",  
                               k, sep = "") 
                return
      
    print("No Triplet") 
      
# Driver Code 
n = 12
pythagoreanTriplet(n) 
  
# This code is contributed 
# by Smitha Dinesh Semwal 

