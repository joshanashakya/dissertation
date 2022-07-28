

//Java Program to find Circuit Rank of an Undirected Graph 
  
public class GFG { 
  
    //Function that calculates the 
    //Circuit rank of the Graph. 
    static int Rank(int Edges, int Vertices) 
    { 
     int result = 0; 
  
     // calculates Circuit Rank 
     result = Edges - Vertices + 1; 
  
     return result; 
    } 
  
    //Driver Code 
    public static void main(String[] args) { 
          
         int Edges = 7, Vertices = 5; 
  
         System.out.println("Circuit Rank = " + Rank(Edges, Vertices)); 
    } 
} 

