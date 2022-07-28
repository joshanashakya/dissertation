

# Python3 implementation of above approach 
  
# Function to print the moves  
def twistedTOH(n, first, middle, last):  
      
    # Base case  
    if (n == 1):  
  
        print("Move disk", n, "from rod", first,  
              "to", middle, "and then to", last)  
  
        return
  
    # Move n-1 disks from first to last  
    twistedTOH(n - 1, first, middle, last)  
  
    # Move largest disk from first to middle  
    print("Move disk", n, "from rod", 
                 first, "to", middle)  
  
    # Move n-1 disks from last to first  
    twistedTOH(n - 1, last, middle, first)  
  
    # Move nth disk from middle to last  
    print("Move disk", n, "from rod",  
                 middle, "to", last)  
  
    # Move n-1 disks from first to last  
    twistedTOH(n - 1, first, middle, last) 
  
# Driver Code  
  
# Number of disks  
n = 2
  
# Rods are in order  
# first(A), middle(B), last(C)  
twistedTOH(n, 'A', 'B', 'C')  
  
# This code is contributed by 
# divyamohan123 

