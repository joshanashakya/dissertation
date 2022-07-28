

# Python program to print the pattern "D" 
# Function to generate the pattern D 
def D_Pattern(string, n): 
      
    # loop for rows 
    for i in range(0, n):     
          
        # loop for columns 
        for j in range(0, n): 
              
            # Logic to generate stars for * 
            if (j == 1 or ((i == 0 or i == n-1) and 
               (j > 1 and j < n-2)) or (j == n-2 and 
                i != 0 and i != n-1)):   
                string = string + "*"    
              
            # For the spaces 
            else:       
                string = string + " " 
                  
        # For changing line 
        string = string + "\n"    
    return(string); 
  
# Driver Code 
string = ""; 
n = 9
print(D_Pattern(string, n)); 

