

// Java program to find factorial of given number 
class Test { 
    // Method to find factorial of the given number 
    static int factorial(int n) 
    { 
        int i = n, fact = 1; 
        while (n / i != n) { 
            fact = fact * i; 
            i--; 
        } 
        return fact; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        int num = 5; 
        System.out.println( 
            "Factorial of " + num 
            + " is " + factorial(5)); 
    } 
} 

