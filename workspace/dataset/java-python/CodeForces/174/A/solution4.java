import com.sun.security.jgss.GSSUtil; import java.io.*;import java.lang.reflect.Array;import java.nio.Buffer;import java.util.*;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.IOException; public class Pair {     public static void main(String[] args) throws Exception {        try {            Scanner sc = new Scanner(System.in);            int n = sc.nextInt(), b = sc.nextInt();             double sum=0;            double[]arr = new double[100];            for(int i=0;i<n;i++){                arr[i] = sc.nextDouble();                sum+=arr[i];            }            sum+=b;            sum/=n;            for(int i=0;i<n;i++){                if(arr[i]>sum){                    System.out.println(-1);                    return;                }            }            for(int i=0;i<n;i++){                System.out.printf( "%.6f\n",sum-arr[i] );            }        }        catch (Exception e) {        }    }}