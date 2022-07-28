

// Java program to find direction 
// with minimum flips  
class GFG 
{ 
  
    // finding which path have 
    // minimum flip bit and  
    // the minimum flip bits  
    static void minimumFlip(String s, 
                            int x, int y) 
    { 
        // concatenating given strin to   
        // itself, to make it circular  
        s = s + s; 
  
        // check x is greater than y.  
        // marking if output need to  
        // be opposite.  
        boolean isOpposite = false; 
        if (x > y)  
        { 
            swap(x, y); 
            isOpposite = true; 
        } 
  
        // iterate Clockwise  
        int valClockwise = 0; 
        char cur = s.charAt(x); 
        for (int i = x; i <= y; i++)  
        { 
  
            // if current bit is not equal  
            // to next index bit.  
            if (s.charAt(i) != cur) 
            { 
                cur = s.charAt(i); 
                valClockwise++; 
            } 
        } 
  
        // iterate Anti-Clockwise  
        int valAnticlockwise = 0; 
        cur = s.charAt(y); 
        x += s.length(); 
        for (int i = y; i < x; i++) 
        { 
  
            // if current bit is not equal  
            // to next index bit.  
            if (s.charAt(i) != cur)  
            { 
                cur = s.charAt(i); 
                valAnticlockwise++; 
            } 
        } 
  
        // Finding whether Clockwise 
        // or Anti-clockwise path  
        // take minimum flip.  
        if (valClockwise <= valAnticlockwise) 
        { 
            if (!isOpposite)  
            { 
                System.out.println("Clockwise " + 
                                    valClockwise); 
            }  
            else 
            { 
                System.out.println("Anti-clockwise " + 
                                    valAnticlockwise); 
            } 
  
        }  
        else if (!isOpposite)  
        { 
            System.out.println("Anti-clockwise " +  
                                valAnticlockwise); 
        }  
        else 
        { 
            System.out.println("Clockwise " + 
                                valClockwise); 
        } 
    } 
  
    static void swap(int a, int b)  
    { 
        int c = a; 
        a = b; 
        b = c; 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        int x = 0, y = 8; 
        String s = "000110"; 
        minimumFlip(s, x, y); 
    } 
}  
  
// This code is contributed by 29AjayKumar 

