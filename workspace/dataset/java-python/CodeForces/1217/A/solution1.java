import java.util.Scanner;public class Main{    public static void main(String args[]){        Scanner in = new Scanner(System.in);        int testCases = in.nextInt();        for(int i = 0; i < testCases; i++){            long str = in.nextLong();            long intel = in.nextLong();            long exp = in.nextLong();            System.out.println(possibilities(str,intel,exp));        }    }     public static long possibilities(long str, long intel, long exp){        if(str + exp <= intel)            return 0;        if(intel >= str){            exp -= intel - str + 1;            str = intel + 1;        }        long difference = exp - intel + str;        long possibilities = (long)Math.min(exp+1,difference/2 + difference%2);        return possibilities;    } }