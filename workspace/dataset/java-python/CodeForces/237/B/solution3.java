// package Practice3.CF237; import java.io.IOException;//import java.io.s;//import java.util.ArrayList;import java.util.Arrays;//import java.util.HashMap;import java.util.Scanner; public class CF237B {    static int[][] arr;    public static void main(String[] args) throws IOException {        Scanner s = new Scanner(System.in);        int r = s.nextInt();        arr = new int[r][];        int x = 0;         for(int i = 0; i < r; i++){            arr[i] = new int[s.nextInt()];            x += arr[i].length;        }         int nums[] = new int[x], cnt = 0;         for(int i = 0; i < r; i++){            for(int j = 0; j < arr[i].length; j++){                arr[i][j] = s.nextInt();                nums[cnt++] = arr[i][j];            }        }         Arrays.sort(nums);        StringBuilder ans = new StringBuilder();        int count = 0;        cnt = 0;         for(int i = 0; i < arr.length; i++)            for(int j = 0; j < arr[i].length; j++){                if(arr[i][j] != nums[cnt]){                    int z[] = find(nums[cnt]);                     int temp = arr[i][j];                    arr[i][j] = arr[z[0]][z[1]];                    arr[z[0]][z[1]] = temp;                     ans.append((i+1) + " " + (j+1) + " " + (z[0] + 1) + " " + (z[1] + 1));                    ans.append("\n");                    count++;                }                 cnt++;            }         System.out.print(count + "\n" + ans);    }      public static int[] find(int a){         int x[] = new int[2];         for(int i = 0; i < arr.length; i++)            for(int j = 0; j < arr[i].length; j++)                if(arr[i][j] == a){                    x[0] = i; x[1] = j;                    return x;                }          return x;    } }
