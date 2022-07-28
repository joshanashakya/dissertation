

// An efficient Java program to check if binary 
// representations of a number and it's complement are anagram. 
class GFG  
{ 
  
static byte longSize = 8; 
static int ULL_SIZE = 8*longSize; 
  
// Returns true if binary representations of 
// a and b are anagram. 
static boolean bit_anagram_check(long a) 
{ 
    // _popcnt64(a) gives number of 1's present 
    // in binary representation of a. If number 
    // of 1s is half of total bits, return true. 
    return (Integer.bitCount((int)a) == (ULL_SIZE >> 1)); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
long a = 4294967295L; 
    System.out.println(bit_anagram_check(a)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

