import java.util.*;public class Main{    public static Scanner sc=new Scanner(System.in);    public static void setArray(int arr[][]){        for(int i=0;i<arr.length;i++){            for (int j=0;j<3;j++){                arr[i][j]=sc.nextInt();            }        }    }    public static void main(String args[]){                int n=sc.nextInt();        int arr[][]=new int[n][3];        setArray(arr);        int ocount=0;        for(int i=0;i<arr.length;i++){            int icount=0;            for (int j=0;j<3;j++){                if(arr[i][j]==1){                    icount++;                }            }            if(icount>=2){                ocount++;            }        }        System.out.println(ocount);        }}
