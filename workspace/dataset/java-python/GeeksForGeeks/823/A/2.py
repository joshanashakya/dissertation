

# Python 3 Implementation to find the minimum 
# no of blocks required to form 
# hollow rectangular prism 
  
# Function to display output 
def disp(row_no,block): 
    print(row_no * block) 
  
# Function to return minimum no of layers 
# required to form the hollow prism 
def row(ht, h): 
    return ht // h 
  
# Function to calculate no of blocks 
# required for each layer 
def calculate(l, w, h, a, ht): 
      
        # No of blocks required for each row 
    no_block = (4 * a) // l 
      
    # Check for no of layers is minimum 
    if (h < w): 
        row_no = row(ht, w) 
    else: 
        row_no = row(ht, h) 
    disp(row_no, no_block) 
  
# Driver function 
if __name__ == '__main__': 
    # Length, width, height of each block 
    l = 50
    w = 20
    h = 35
  
    # Side of one wall 
    a = 700
  
    # height of each wall 
    ht = 140
  
    calculate(l, w, h, a, ht) 
  
# This code is contributed by Surendra_Gangwar 

