

// Java program to find dimensions of 
// Right angled triangle 
class GFG { 
  
    // function to calculate dimension 
    static void findDimen(int H, int A) 
    { 
  
        // P^2+B^2 = H^2 
        // P*B = 2*A 
        // (P+B)^2 = P^2+B^2+2*P*B = H^2+4*A 
        // (P-B)^2 = P^2+B^2-2*P*B = H^2-4*A 
        // P+B = sqrt(H^2+4*A) 
        // |P-B| = sqrt(H^2-4*A) 
        if (H * H < 4 * A) { 
            System.out.println("Not Possible"); 
            return; 
        } 
  
        // sqrt value of H^2 + 4A and H^2- 4A 
        double apb = Math.sqrt(H * H + 4 * A); 
        double asb = Math.sqrt(H * H - 4 * A); 
  
        System.out.println("P = " + Math.round(((apb - asb) / 2.0) * 100.0) / 100.0); 
        System.out.print("B = " + Math.round(((apb + asb) / 2.0) * 100.0) / 100.0); 
    } 
  
    // Driver function 
    public static void main(String[] args) 
    { 
        int H = 5; 
        int A = 6; 
  
        findDimen(H, A); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

