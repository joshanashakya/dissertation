import java.util.*;public class Main {    public static void main(String args[]) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while(t--!=0){        int n = sc.nextInt();        int arr[] = new int[n];        for(int i = 0; i<n; i++){            arr[i] = sc.nextInt();        }            int p = 0 , q = n-1;            for(int i = 0; i<n; i++){                if(i%2==1){                    System.out.print(arr[q] + " ");                    q--;                }                else{                    System.out.print(arr[p] + " ");                    p++;                }            }            System.out.println();        }            }}
