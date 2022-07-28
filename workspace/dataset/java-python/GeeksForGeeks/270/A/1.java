

// Java progroam for Efficient method 
// to print cubes between a and b 
  
class Test { 
    // An efficient solution to print perfect 
    // cubes between a and b 
    static void printCubes(int a, int b) 
    { 
        // Find cube root of both a and b 
        int acrt = (int)Math.cbrt(a); 
        int bcrt = (int)Math.cbrt(b); 
  
        // Print cubes between acrt and bcrt 
        for (int i = acrt; i <= bcrt; i++) 
            if (i * i * i >= a && i * i * i <= b) 
                System.out.print(i * i * i + " "); 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        int a = 24, b = 576; 
        System.out.println("Perfect cubes in given range:"); 
        printCubes(a, b); 
    } 
} 

