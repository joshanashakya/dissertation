import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*; public class Solution {    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     public static void main(String[] args) throws IOException {         int n= nextInt();        int inp[]= readIntArray();        int min1=inp[0],max1=inp[1];        inp= readIntArray();        int min2=inp[0],max2=inp[1];        inp= readIntArray();        int min3=inp[0],max3=inp[1];         int res1=min1,res2=min2,res3=min3;        int tot=(res1+res2+res3);        if(tot<n) {            res1+= Math.min((n-tot), (max1 - res1));            tot=(res1+res2+res3);        }        if(tot<n){            res2+= Math.min((n-tot), (max2 - res2));            tot=(res1+res2+res3);        }         if(tot<n){            res3+= Math.min((n-tot), (max3 - res3));        }        println(res1+" "+res2+" "+res3);    }     public static void swap(int arr[],int from,int to){        println("swapping: "+from+" & "+to);        int temp= arr[from];        arr[from]= arr[to];        arr[to]= temp;    }  // *********************************************************************************************** //     public static String readLine() throws IOException{        return br.readLine();    }    public static String[] readStringArray()throws  IOException{        return br.readLine().split(" ");    }    public static int[] readIntArray()throws IOException{        return Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();    }    public static long[] readLongArray() throws IOException{        return Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();    }    public static long nextLong()throws IOException{        return Long.parseLong(br.readLine().trim());    }    public static int nextInt()throws IOException{        return Integer.parseInt(br.readLine().trim());    }     public static void println(String out){        System.out.println(out);    }     public static void println(int out){        System.out.println(out);    }     public static void println(double out){        System.out.print(out);    }     public static void print(String out){        System.out.print(out);    }     public static void print(int out){        System.out.print(out);    }     public static void print(double out){        System.out.print(out);    }     public static void print(long out){        System.out.print(out);    }     public static void println(long out){        System.out.println(out);    }}
