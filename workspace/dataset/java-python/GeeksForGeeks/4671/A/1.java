

// Java program to find maximum number of lines 
// which can pass through a single point 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{ 
  
// function to find maximum lines which passes 
// through a single point 
static int maxLines(int n, int x1[], int y1[],  
                    int x2[], int y2[]) 
{ 
    Set<Double> s=new HashSet<Double>(); 
  
    double slope; 
    for (int i = 0; i < n; ++i) { 
        if (x1[i] == x2[i]) 
            slope = Integer.MAX_VALUE; 
        else
            slope = (y2[i] - y1[i]) * 1.0 
                    / (x2[i] - x1[i]) * 1.0; 
  
        s.add(slope); 
    } 
  
    return s.size(); 
} 
  
// Driver program 
public static void main(String args[]) 
{ 
    int n = 2, x1[] = { 1, 2 }, y1[] = { 1, 2 }, 
            x2[] = { 2, 4 }, y2[] = { 2, 10 }; 
    System.out.print(maxLines(n, x1, y1, x2, y2)); 
} 
} 
// This code is written by 
// Subhadeep 

