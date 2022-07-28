

//Java Program to implement above code. 
  
public class GFG { 
      
    //function to calculate the length of bridge. 
    static int bridge_length(int trainLength,  
                            int Speed, int Time) 
    { 
    return ((Time * Speed) - trainLength); 
    } 
  
    //Driver Code 
    public static void main(String[] args) { 
          
        // Assuming the input variables 
        int trainLength = 120; 
        int Speed = 30; 
        int Time = 18; 
  
        System.out.print("Length of bridge = "+ 
            bridge_length(trainLength, Speed,Time) 
            +" meters"); 
    } 
} 

