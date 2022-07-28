

# Python3 program to print the given pattern 
def print_asterisk(asterisk): 
      
    # base case 
    if (asterisk == 0): 
        return; 
    print("* ", end = ""); 
    print_asterisk(asterisk - 1); 
  
def print_space(space): 
  
    # base case 
    if (space == 0): 
        return; 
    print(" ", end = ""); 
    print(" ", end = ""); 
    print_space(space - 1); 
  
# function to print the  
# upper-half of the pattern 
def pattern_upper(n, num): 
  
    # base case 
    if (n == 0): 
        return; 
    print_asterisk(num - n + 1); 
    print_space(2 * n - 1); 
    print_asterisk(num - n + 1); 
    print(); 
  
    # recursively calling pattern_upper() 
    pattern_upper(n - 1, num); 
  
# function to print the lower-half 
# of the pattern 
def pattern_lower(n, num): 
  
    if (n == 0): 
        return; 
    print_asterisk(n); 
    print_space(2 * (num - n) + 1); 
    print_asterisk(n); 
    print(); 
  
    # recursively calling pattern_lower( 
    pattern_lower(n - 1, num); 
  
# function to print the pattern 
def pattern(n, num): 
  
    pattern_upper(n, num); 
    pattern_lower(n - 1, num); 
  
# Driver Code 
if __name__ == '__main__': 
    n = 5; 
    pattern(n, n); 
  
# This code is contributed by Princi Raj 

