import java.util.*;public class LittleElephantandMagicSquare {    public static void main(String arg[]){        Scanner sc = new Scanner(System.in);        int[][] arr = new int[3][3];        long sum = 0;         for(int i = 0; i<3; i++){            for(int j = 0; j<3; j++){                    arr[i][j] = sc.nextInt();                    sum += arr[i][j];            }        }         sum /=2;         arr[0][0] = (int)sum-arr[0][1]-arr[0][2];        arr[1][1] = (int)sum-arr[1][0]-arr[1][2];        arr[2][2] = (int)sum-arr[2][0]-arr[2][1];         System.out.println();                 for(int i = 0; i<3; i++){            for(int j = 0; j<3; j++){                System.out.print(arr[i][j]+" ");            }            System.out.println();        }        }}
