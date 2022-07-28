

// Java Program to find sum of square of first 
// n natural numbers. This program avoids 
// overflow upto some extent for large value 
// of n. 
  
import java.io.*; 
import java.util.*;  
  
class GFG 
{ 
    // Return the sum of square of first n natural 
    // numbers 
public static int squaresum(int n) 
{ 
    return (n * (n + 1) / 2) * (2 * n + 1) / 3; 
} 
  
    public static void main (String[] args) 
    { 
        int n = 4; 
    System.out.println(squaresum(n)); 
    } 
} 
  
// Code Contributed by Mohit Gupta_OMG <(0_o)> 

