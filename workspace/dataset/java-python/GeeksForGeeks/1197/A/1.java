

// Java implementation to delete nth digit 
// from starting with O(1) time complexity. 
  
public class DeleteN { 
  
    public static void main(String args[]) { 
  
        int in = 1234; 
        // type cast input number to string 
        String inp = Integer.toString(in); 
        int del = 3; 
        System.out.println("num_after_deleting_from_starting " + fromStart(inp, del)); 
        System.out.println("num_after_deleting_from_ending " + fromEnd(inp, del)); 
    } 
  
    // function to delete nth number from starting 
    static String fromStart(String inp, int del) { 
  
        try { 
            String inp1 = inp.substring(0, del - 1); 
            String inp2 = inp.substring(del, inp.length()); 
            return inp1 + inp2; 
        } 
  
        catch (Exception e) { 
            return "Check Input"; 
        } 
    } 
  
    // function to delete nth number from ending 
    static String fromEnd(String inp, int del) { 
  
        try { 
            String inp1 = inp.substring(0, inp.length() - del); 
            String inp2 = inp.substring(inp.length() - del + 1, inp.length()); 
            return inp1 + inp2; 
        } 
  
        catch (Exception e) { 
            return "Check Input"; 
        } 
    } 
  
} 

