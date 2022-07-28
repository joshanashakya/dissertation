

# Python3 implementation of the approach  
  
# Function to reverse the words  
# of the given sentence  
def reverse(k): 
    # Create an empty character array stack  
    s = []  
    token = k.split() 
      
    # Push words into the stack  
    for word in token : 
        s.append(word); 
          
    while (len(s)) : 
        # Get the words in reverse order  
        print(s.pop(),end= " ");  
      
  
# Driver code  
if __name__ == "__main__" :  
  
    k = "geeks for geeks";  
    reverse(k);  
      
# This code is contributed by AnkitRai01 

