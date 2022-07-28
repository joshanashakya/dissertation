

// Java implementation of above approach 
class GFG{ 
   
// Function to print the 
// kth largest String 
static void kthString(int n, int k) 
{ 
    int total = 0; 
    int i = 1; 
   
    // loop to iterate through 
    // series 
    while (total < k) { 
        // total takes the position 
        // of second y 
        total = total + n - i; 
   
        // i takes the position of 
        // first y 
        i++; 
    } 
   
    // calculating first y postion 
    int first_y_position = i - 1; 
   
    // calculating second y position 
    // from first y 
    int second_y_position = k - (total - n + first_y_position); 
   
    // print all x before first y 
    for (int j = 1; j < first_y_position; j++) 
        System.out.print("x"); 
   
    // print first y 
    System.out.print("y"); 
   
    int j = first_y_position + 1; 
   
    // print all x between first y 
    // and second y 
    while (second_y_position > 1) { 
        System.out.print("x"); 
        second_y_position--; 
        j++; 
    } 
   
    // print second y 
    System.out.print("y"); 
   
    // print x which occur 
    // after second y 
    while (j < n) { 
        System.out.print("x"); 
        j++; 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5; 
   
    int k = 7; 
   
    kthString(n, k);  
} 
} 
  
// This code is contributed by sapnasingh4991 

