

# Program to print the given pattern 
def print_asterisk(asterisk): 
    if (asterisk == 0): 
        return; 
    print("*", end = " "); 
    print_asterisk(asterisk - 1); 
  
def print_space(space): 
    if (space == 0): 
        return; 
    print(" ", end = ""); 
    print(" ", end = ""); 
    print_space(space - 1); 
  
# function to print the pattern 
def pattern(n, num): 
  
    # base case 
    if (n == 0): 
        return; 
    print_asterisk(num - n + 1); 
    print_space(2 * n - 1); 
    print_asterisk(num - n + 1); 
    print(); 
  
    # recursively calling pattern() 
    pattern(n - 1, num); 
  
# Driver Code 
if __name__ == '__main__': 
    n = 5; 
    pattern(n, n); 
      
# This code is contributed by Princi Singh 

