import java.util.*;import java.io.*;public class Main{         public static void main(String [] args) throws IOException{                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));                String [] nk = bf.readLine().trim().split(" ");                 int n = Integer.parseInt(nk[0]);                int k = Integer.parseInt(nk[1]);                char [] arr = new char[n];		int i=0;		while(i<n){			arr[i] = (char) (97+i%Math.min(26,k));			i++;		}		System.out.println(arr);         }         public static int lastOccurance(int []arr, int start, int end, int key){                int res = -1;                while(start <= end){                        int mid = start + (end-start)/2;                         if(arr[mid] == key){                                res = mid;                                start = mid+1;                        }                        else if(arr[mid] > key)                                start = mid+1;                        else if(arr[mid] < key)                                end = mid-1;                }                 return res;        }                public static int firstOccurance(int []arr, int start, int end, int key){                int res = -1;                while(start <= end){                        int mid = start + (end-start)/2;                         if(arr[mid] == key){                                res = mid;                                end = mid-1;                        }                        else if(arr[mid] > key)                                start = mid+1;                        else if(arr[mid] < key)                                end = mid-1;                }                 return res;        } }