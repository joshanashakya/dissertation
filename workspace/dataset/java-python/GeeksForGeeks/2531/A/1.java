

// Java program to Find the minimum  
// number of moves required to reach 
// the destination by the king in a  
// chess board 
import java.io.*; 
  
class GFG  
{ 
  
// function to Find the minimum number  
// of moves required to reach the 
// destination by the king in a chess board 
static void MinSteps(int SourceX, int SourceY, 
                     int DestX, int DestY) 
{ 
    // minimum number of steps 
    System.out.println(Math.max(Math.abs(SourceX - DestX), 
                     Math.abs(SourceY - DestY))); 
  
    // while the king is not in the same  
    // row or column as the destination 
    while ((SourceX != DestX) ||  
           (SourceY != DestY))  
    { 
  
        // Go up 
        if (SourceX < DestX) 
        { 
            System.out.print( 'U'); 
            SourceX++; 
        } 
  
        // Go down 
        if (SourceX > DestX) 
        { 
            System.out.println( 'D'); 
            SourceX--; 
        } 
  
        // Go left 
        if (SourceY > DestY)  
        { 
            System.out.print( 'L'); 
            SourceY--; 
        } 
  
        // Go right 
        if (SourceY < DestY)  
        { 
            System.out.print( 'R'); 
            SourceY++; 
        } 
  
        System.out.println(); 
    } 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int sourceX = 4, sourceY = 4; 
    int destinationX = 7, destinationY = 0; 
  
    MinSteps(sourceX, sourceY,  
             destinationX, destinationY); 
} 
} 
  
// This code is contributed by inder_verma 

