import java.util.Scanner;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int n = s.nextInt();        int arr[] = new int[n];        int prefix[] = new int[n];        for(int i = 0; i < n; i++){            arr[i] = s.nextInt();        }        for(int i = 0; i < n; i++){            if(i < 2){                prefix[i] = arr[i];            }            else{                prefix[i] = prefix[i - 2] + arr[i];            }                  }        int suffix[] = new int[n];        for(int i = n - 1; i >= 0; i--){            if(i + 2 >= n){                suffix[i] = arr[i];             }            else{                suffix[i] = suffix[i + 2] + arr[i];            }        }        int count = 0;        for(int i = 0; i < n; i++){            int left = 0,right = 0;            if(i > 0){                left = prefix[i - 1];            }            if(i + 2 < n){                left += suffix[i + 2];            }            if(i > 1){                right = prefix[i - 2];            }            if(i + 1 < n){                right += suffix[i + 1];            }            if(left == right){                count++;            }         }        System.out.println(count);     }}
