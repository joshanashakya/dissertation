import java.util.*;public class RoadsideTrees {    public static void main(String arg[]){        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int[] arr = new int[n];        int i =0;        for(int j = 0; j<n; j++)            arr[j] = sc.nextInt();         int sum = 0,level = arr[0];        sum += arr[0];        for(; i<n-1; i++){            if(level == arr[i])                sum++;             if(i+1<n && (arr[i]-arr[i+1]>0)) {                sum = sum + arr[i] - arr[i+1] + 1;                level = arr[i+1];            }            else if(i+1<n && (arr[i]-arr[i+1]<0)){                sum = sum+1+arr[i+1]-arr[i];                level = arr[i+1];            }            else{                sum++;            }        }         if(level==arr[i]){           sum++;        }        else{            sum = sum+(arr[i]-level)+1;        }         System.out.println(sum);    }}
